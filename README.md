# Automatic Beverage Vending Machine

A Java (Maven) project that models an automatic coffee and tea vending machine. A user places an order for a beverage, optionally adds condiments such as milk or sugar, and the system builds the final order. The code is organised around small, single-purpose classes and is covered by JUnit 5 tests.

## Features

- Several beverages: Coffee, Espresso, Tea, and Green Tea
- Optional condiments: Milk and Sugar
- Orders placed by a user
- Unit tests with JUnit 5
- Maven build with Java module support (`module-info.java`)

## Project Structure

```
CoffeeVendingMachine
├── src
│   ├── AutomaticBeverageVendingMachine
│   │   ├── Beverage.java        # Base type for every drink
│   │   ├── Coffee.java          # Beverage: coffee
│   │   ├── Espresso.java        # Beverage: espresso
│   │   ├── Tea.java             # Beverage: tea
│   │   ├── GreenTea.java        # Beverage: green tea
│   │   ├── Condiment.java       # Base type for add-ons
│   │   ├── Milk.java            # Condiment: milk
│   │   ├── Sugar.java           # Condiment: sugar
│   │   ├── Order.java           # An order made up of a beverage and its add-ons
│   │   ├── User.java            # The customer placing the order
│   │   ├── Test.java            # Demo / driver class
│   │   └── BeverageTest.java    # JUnit 5 tests
│   └── module-info.java
└── pom.xml
```

<!-- TODO: confirm the exact package name; the screenshot cuts it off after "AutomaticBeverageVendingMach". -->

## Design

- **Beverages** (`Coffee`, `Espresso`, `Tea`, `GreenTea`) extend or implement `Beverage`, so the rest of the code can treat any drink the same way.
- **Condiments** (`Milk`, `Sugar`) extend `Condiment`, so new add-ons can be introduced without changing the beverage classes.
- **Order** brings the user, the chosen beverage, and the condiments together.

<!-- TODO: if Condiment wraps a Beverage, this is the Decorator pattern; say so here and describe how cost/description is composed. -->

## Tech Stack

| Area | Tool |
|---|---|
| Language | Java 17 (recommended) |
| Build | Maven |
| Testing | JUnit 5 |
| IDE | Eclipse (any Maven-aware IDE works) |

> **Note:** `module-info.java` needs Java 9 or newer. If your IDE shows the JRE as `J2SE-1.5`, change the project's Java version to 17 and set `maven.compiler.release` to `17` in `pom.xml`.

## Getting Started

### Prerequisites

- JDK 17 or newer
- Maven 3.8 or newer

### Clone and build

```bash
git clone https://github.com/bhargavasai-creator/CoffeeVendingMachine.git
cd CoffeeVendingMachine
mvn clean compile
```

<!-- TODO: replace the repository URL with the real one. -->

### Run the demo

From Eclipse: right-click `Test.java`, then **Run As → Java Application**.

From the command line:

```bash
java -cp target/classes AutomaticBeverageVendingMachine.Test
```

<!-- TODO: confirm Test.java contains main(); adjust the class name if needed. -->

### Run the tests

```bash
mvn test
```

## Example Flow

1. A `User` starts an order.
2. They choose a beverage, for example an `Espresso`.
3. They add condiments, for example `Milk` and `Sugar`.
4. The `Order` is completed and the result is shown.

## Ideas for Future Work

- Payment handling and change calculation
- Inventory tracking for ingredients, with low-stock alerts
- More beverages and condiments (hot chocolate, caramel, oat milk)
- A command-line menu or simple GUI
- Saving order history to a file or database

## Author

**Bhargav Sai Gundapaneni**
GitHub: [bhargavasai-creator](https://github.com/bhargavasai-creator)

## License

<!-- TODO: choose a license (MIT is a common default) and add a LICENSE file. -->
