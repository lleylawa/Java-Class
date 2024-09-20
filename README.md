## Overview
This project implements a Java class named `Book`, which represents a book entity with attributes and methods for managing book information. The purpose of this project is to illustrate object-oriented programming concepts, including constructors, attributes, and methods, as well as to provide an example of applying a discount to a book's price.

## Class Definition
The `Book` class contains the following attributes:
- **title** (String): The title of the book.
- **author** (String): The author of the book.
- **ISBN** (String): The International Standard Book Number of the book.
- **price** (double): The price of the book.

### Constructors
- **Default Constructor**: Initializes the book with empty strings for `title`, `author`, and `ISBN`, and sets `price` to 0.0.
- **Parameterized Constructor**: Initializes the book with specified values for `title`, `author`, `ISBN`, and `price`.

### Methods
- **displayInfo()**: Prints the details of the book in a formatted manner, including title, author, ISBN, and price.
- **applyDiscount(double discountPercentage)**: Applies a discount to the book's price based on the provided percentage (if it is between 0 and 100).

## Usage
In the main method of the `Book` class:
1. An object is created using the default constructor, and its information is displayed.
2. Two objects are created using the parameterized constructor with specific values for `title`, `author`, `ISBN`, and `price`.
3. The `displayInfo()` method is called for each book to display their details.
4. A discount is applied to the first book, and the updated information is displayed.

## UML Class Diagram
A UML Class Diagram visualizing the structure of the `Book` class:

![Снимок экрана 2024-09-20 195915](https://github.com/user-attachments/assets/ffd28616-f5c8-4656-9801-b8658310c5ba)
