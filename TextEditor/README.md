# Simple Text Editor 📝

This project is a simple text editor application built using Java Swing. The application provides basic functionalities for text editing, such as creating, opening, saving, printing, and editing text documents. It is designed to be straightforward and easy to use, making it a great example of a Java Swing application.

## Features ✨

- **New File**: Create a new text document from scratch.
- **Open File**: Open an existing text document.
- **Save File**: Save the current text document to a file.
- **Print File**: Print the current text document.
- **Cut, Copy, Paste**: Perform basic text editing operations.

## Requirements 🛠️

- Java Development Kit (JDK) 8 or later

## How to Run ▶️

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/simple-text-editor.git
    ```

2. Navigate to the project directory:
    ```bash
    cd simple-text-editor
    ```

3. Compile the Java source files:
    ```bash
    javac com/kiet/lalit/editor.java
    ```

4. Run the application:
    ```bash
    java com.kiet.lalit.editor
    ```

## Code Overview 📜

The main class `editor` extends `JFrame` and implements `ActionListener` to handle various menu actions. Below is a detailed explanation of the key components and functionalities:

### Constructor

The constructor initializes the GUI components and sets up the look and feel of the application:

- **Frame**: A `JFrame` named `f` is created with the title "editor".
- **Look and Feel**: The metal look and feel is set, with the Ocean theme applied.
- **Text Area**: A `JTextArea` named `t` is created for text input and editing.
- **Menu Bar**: A `JMenuBar` named `mb` is created to hold the menus.
- **File Menu**: A `JMenu` named `m1` is created with menu items for file operations (New, Open, Save, Print).
- **Edit Menu**: A `JMenu` named `m2` is created with menu items for text editing operations (Cut, Copy, Paste).
- **Close Option**: A menu item for closing the application is also added to the menu bar.

### Action Handling

The `actionPerformed` method handles actions triggered by the menu items:

- **Cut**: `t.cut()` - Cuts the selected text.
- **Copy**: `t.copy()` - Copies the selected text.
- **Paste**: `t.paste()` - Pastes the copied/cut text.
- **Save**: Opens a `JFileChooser` to select a file location and saves the text content to the selected file.
- **Print**: Prints the current text content using `t.print()`.
- **Open**: Opens a `JFileChooser` to select and load a text file into the text area.
- **New**: Clears the text area for a new document.
- **Close**: Closes the application window.

### File Operations

- **Save**: When the Save menu item is selected, a `JFileChooser` is displayed. If a file is selected, the content of the text area is written to the file using a `BufferedWriter`.
- **Open**: When the Open menu item is selected, a `JFileChooser` is displayed. If a file is selected, the content of the file is read using a `BufferedReader` and displayed in the text area.
- **Print**: The current content of the text area is sent to the printer.

### Edit Operations

- **Cut, Copy, Paste**: These operations are directly performed on the text area using the respective methods `cut()`, `copy()`, and `paste()`.

## Contributing 🤝

Contributions are welcome! If you would like to contribute, please fork the repository and submit a pull request with your changes. Any enhancements or bug fixes are appreciated.


## CODE PREVIEW
![GIF](https://github.com/Lalitsh01/JAVA_Projects/assets/106839375/66d23fbe-c86b-4b29-ab84-4681c91faea1)


## KEEP_LEARNING KEEP_GROWING 🧑‍💻✌️

## HAPPY_CODING 🚀

