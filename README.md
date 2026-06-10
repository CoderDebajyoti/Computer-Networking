# Computer Networking Lab Assignments

This repository contains a collection of Java programs developed for Computer Networking assignments. The assignments cover a wide range of networking concepts including IP address manipulation, flow control protocols, error detection/correction mechanisms, routing algorithms, application protocols, and cryptographic algorithms.

---

## 📂 Repository Structure

The project is structured into assignments and utility folders:

```text
📂 Computer-Networking
 ┣ 📂 ASSIGNMENT1   # IP Address Utilities & Subnetting Calculations
 ┣ 📂 ASSIGNMENT2   # Flow Control & Sliding Window (Static Implementations)
 ┣ 📂 ASSIGNMENT3   # Flow Control & Sliding Window (Interactive Implementations)
 ┣ 📂 ASSIGNMENT4   # Core Protocols, Routing Algorithms & Topologies
 ┣ 📂 ASSIGNMENT6   # Advanced Adaptive & Non-Adaptive Routing Protocols
 ┗ 📂 TEST          # Cryptography and security simulations (RSA)
```

---

## 📝 Detailed Assignment Breakdown

### 🔹 Assignment 1: IP Address Utilities & Subnetting
Focuses on IP address classification, format conversion, and fundamental subnet calculations.

| Program File | Description |
| :--- | :--- |
| **[A1_P1.java](ASSIGNMENT1/A1_P1.java)** | Finds and displays the local host IP address of the machine. |
| **[A1_P2.java](ASSIGNMENT1/A1_P2.java)** | Determines whether a user-entered IP address is IPv4 or IPv6. |
| **[A1_P3.java](ASSIGNMENT1/A1_P3.java)** | Classifies an IPv4 address into Class A, B, C, D, or E based on the first octet. |
| **[A1_P4.java](ASSIGNMENT1/A1_P4.java)** | Validates whether a given IP address is public or private. |
| **[A1_P5.java](ASSIGNMENT1/A1_P5.java)** | Converts a dot-decimal IP address into its 32-bit binary representation. |
| **[A1_P6.java](ASSIGNMENT1/A1_P6.java)** | Converts a 32-bit binary IP address back to its dot-decimal format. |
| **[A1_P7.java](ASSIGNMENT1/A1_P7.java)** | Calculates the Network ID and Broadcast Address using an IP and its Subnet Mask. |
| **[A1_P8.java](ASSIGNMENT1/A1_P8.java)** | Finds the Subnet Mask in dot-decimal format given the prefix length (CIDR notation). |
| **[A1_P9.java](ASSIGNMENT1/A1_P9.java)** | Calculates the number of subnets created given the number of borrowed subnet bits. |
| **[A1_P10.java](ASSIGNMENT1/A1_P10.java)** | Computes the number of usable hosts per subnet based on the number of host bits. |

---

### 🔹 Assignment 2: Flow Control & Sliding Window (Static)
Simulates sliding window flow control, packet loss, and retransmissions using pre-configured static values.

| Program File | Description |
| :--- | :--- |
| **[A2_P1.java](ASSIGNMENT2/A2_P1.java)** | Standard simulation of the Sliding Window flow control mechanism. |
| **[A2_P2.java](ASSIGNMENT2/A2_P2.java)** | Simulation of the Sender and Receiver Window synchronization mechanism. |
| **[A2_P3.java](ASSIGNMENT2/A2_P3.java)** | Sliding window simulation incorporating basic error detection. |
| **[A2_P4.java](ASSIGNMENT2/A2_P4.java)** | Simulates frame loss and the Go-Back-N (GBN) retransmission protocol. |
| **[A2_P5.java](ASSIGNMENT2/A2_P5.java)** | Calculates the theoretical throughput of a sliding window protocol. |
| **[A2_P6.java](ASSIGNMENT2/A2_P6.java)** | Simulates bidirectional sliding window frame exchanges. |
| **[A2_P7.java](ASSIGNMENT2/A2_P7.java)** | Analyzes transmission efficiency based on variation of window size. |
| **[A2_P8.java](ASSIGNMENT2/A2_P8.java)** | Provides a console-based graphical simulation of sliding window transmissions. |

---

### 🔹 Assignment 3: Flow Control & Sliding Window (Interactive)
Extends the concepts in Assignment 2 by making them fully interactive, accepting user inputs for window sizes, frame counts, and loss scenarios.

| Program File | Description |
| :--- | :--- |
| **[A3_P1.java](ASSIGNMENT3/A3_P1.java)** | Interactive simulation of Sliding Window flow control based on user parameters. |
| **[A3_P2.java](ASSIGNMENT3/A3_P2.java)** | Interactive demonstration of the Sender and Receiver Window Mechanism. |
| **[A3_P3.java](ASSIGNMENT3/A3_P3.java)** | Interactive sliding window simulator with customizable transmission error detection. |
| **[A3_P4.java](ASSIGNMENT3/A3_P4.java)** | Simulates Go-Back-N packet loss and retransmission based on dynamic user input. |
| **[A3_P5.java](ASSIGNMENT3/A3_P5.java)** | Dynamically computes sliding window throughput based on user-provided values. |
| **[A3_P6.java](ASSIGNMENT3/A3_P6.java)** | Runs an interactive bidirectional sliding window communication session. |
| **[A3_P7.java](ASSIGNMENT3/A3_P7.java)** | Evaluates the performance impacts of window size variation based on user inputs. |
| **[A3_P8.java](ASSIGNMENT3/A3_P8.java)** | Generates step-by-step graphical frame progress visualizers in the console. |

---

### 🔹 Assignment 4: Core Protocols, Routing & Topologies
Covers structural topologies, error-correcting codes, basic routing algorithms, and core application/network layer protocols.

| Program File | Description |
| :--- | :--- |
| **[A4_P1.java](ASSIGNMENT4/A4_P1.java)** | Graphically maps and prints network topologies (Bus, Star, Ring, Mesh) for *N* nodes. |
| **[A4_P2.java](ASSIGNMENT4/A4_P2.java)** | Implements error-detection using Cyclic Redundancy Check (CRC). |
| **[A4_P3.java](ASSIGNMENT4/A4_P3.java)** | Encodes and validates messages using Hamming Code for error detection/correction. |
| **[A4_P4.java](ASSIGNMENT4/A4_P4.java)** | Simulates routing tables using the Distance Vector Routing (Bellman-Ford) algorithm. |
| **[A4_P5.java](ASSIGNMENT4/A4_P5.java)** | Simulates shortest paths using the Link State Routing (Dijkstra's) algorithm. |
| **[A4_P6.java](ASSIGNMENT4/A4_P6.java)** | Simulates Address Resolution Protocol (ARP) for IP-to-MAC address mapping. |
| **[A4_P7.java](ASSIGNMENT4/A4_P7.java)** | Simulates Domain Name System (DNS) Lookup for IP and domain name translation. |
| **[A4_P8.java](ASSIGNMENT4/A4_P8.java)** | Simulates Dynamic Host Configuration Protocol (DHCP) for lease allocation. |
| **[A4_P9.java](ASSIGNMENT4/A4_P9.java)** | Compares and simulates Packet Switching vs. Circuit Switching paradigms. |
| **[A4_P10.java](ASSIGNMENT4/A4_P10.java)** | Emulates basic HTTP Request (GET) construction and formats server headers. |

---

### 🔹 Assignment 6: Advanced Routing Protocols
Simulates modern adaptive and non-adaptive routing protocols utilized across complex, multi-autonomous systems.

| Program File | Description |
| :--- | :--- |
| **[A6_P1.java](ASSIGNMENT6/A6_P1.java)** | Simulates Adaptive Routing: Isolated (Backward Learning), Centralized (RCC), and Distributed (Distance Vector) algorithms. |
| **[A6_P2.java](ASSIGNMENT6/A6_P2.java)** | Simulates Non-Adaptive Routing: Flooding and Random Walk path traversal routing. |
| **[A6_P3.java](ASSIGNMENT6/A6_P3.java)** | Simulates Border Gateway Protocol (BGP) Path Vector routing, loop detection, and path selection. |
| **[A6_P4.java](ASSIGNMENT6/A6_P4.java)** | Simulates Open Shortest Path First (OSPF) routing using Dijkstra's algorithm across multiple network routers. |

---

### 🔹 Cryptography Test
Demonstrates core security algorithms for network data encryption.

| Program File | Description |
| :--- | :--- |
| **[RSA.java](TEST/RSA.java)** | Simulates RSA public/private key generation, including prime checks and modular inverse computations via the Extended Euclidean Algorithm. |

---

## 🚀 How to Compile and Run

All programs are standalone Java files. To run any program, follow these standard steps:

1. **Open your terminal or command prompt** and navigate to the directory containing the program:
   ```bash
   cd ASSIGNMENT1
   ```

2. **Compile the Java file** using `javac`:
   ```bash
   javac A1_P1.java
   ```

3. **Run the compiled Java class**:
   ```bash
   java A1_P1
   ```

> [!NOTE]
> - Interactive scripts (particularly in `ASSIGNMENT3`, `ASSIGNMENT4`, and `TEST`) will prompt you for input in the terminal.
> - Source files contain commented blocks at the end showing sample input and output logs for quick verification.