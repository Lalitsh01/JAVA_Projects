package com.kiet.lalit;

import java.util.Scanner;

class Reservation {
    private int id;
    private String name;
    private String date;
    private int numberOfGuests;

    public Reservation(int id, String name, String date, int numberOfGuests) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.numberOfGuests = numberOfGuests;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }
}

class ReservationSystem {
    private Reservation[] reservations;
    private int nextId;
    private int size;

    public ReservationSystem() {
        reservations = new Reservation[10]; // initial capacity of 10
        nextId = 1;
        size = 0;
    }

    public Reservation makeReservation(String name, String date, int numberOfGuests) {
        Reservation reservation = new Reservation(nextId++, name, date, numberOfGuests);
        if (size < reservations.length) {
            reservations[size++] = reservation;
        } else {
            // resize the array if it's full
            Reservation[] temp = new Reservation[reservations.length * 2];
            for (int i = 0; i < reservations.length; i++) {
                temp[i] = reservations[i];
            }
            reservations = temp;
            reservations[size++] = reservation;
        }
        return reservation;
    }

    public void printReservations() {
        for (int i = 0; i < size; i++) {
            System.out.println(reservations[i].getId() + " - " + reservations[i].getName() + " - " + reservations[i].getDate() + " - " + reservations[i].getNumberOfGuests());
        }
    }

    public boolean cancelReservation(int id) {
        for (int i = 0; i < size; i++) {
            if (reservations[i].getId() == id) {
                // shift all elements to the left to fill the gap
                for (int j = i; j < size - 1; j++) {
                    reservations[j] = reservations[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }
}

class ReservationSystemUI {
    private ReservationSystem reservationSystem;

    public ReservationSystemUI() {
        reservationSystem = new ReservationSystem();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Make a reservation");
            System.out.println("2. View all reservations");
            System.out.println("3. Cancel a reservation");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Date(DD-MM-YYYY): ");
                    String date = scanner.nextLine();
                    System.out.print("Number of guests: ");
                    int numberOfGuests = scanner.nextInt();
                    scanner.nextLine();

                    Reservation reservation = reservationSystem.makeReservation(name, date, numberOfGuests);
                    System.out.println("Reservation made with ID " + reservation.getId());
                    break;
                case 2:
                    System.out.println("Reservations:");
                    reservationSystem.printReservations();
                    break;
                case 3:
                    System.out.print("Reservation ID to cancel: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    if (reservationSystem.cancelReservation(id)) {
                        System.out.println("Reservation canceled");
                    } else {
                        System.out.println("Reservation not found");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        ReservationSystemUI obj = new ReservationSystemUI();
        obj.start();
    }
}