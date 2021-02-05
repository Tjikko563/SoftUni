# Exercise: Data Types and Variables

Problems for exercises and homework for the [&quot;Technology Fundamentals&quot; course @ SoftUni.](https://softuni.bg/courses/programming-fundamentals)

You can check your solutions in [Judge.](https://judge.softuni.bg/Contests/1228)

## 1. Integer Operations

Read **four integer** numbers.
Add first to the second, divide (integer) the sum by the third number and multiply the result by the fourth number. Print the result.

### Constraints

- First number will be in the range [-2,147,483,648… 2,147,483,647]
- Second number will be in the range [-2,147,483,648… 2,147,483,647]
- Third number will be in the range [-2,147,483,648… 2,147,483,647]
- Fourth number will be in the range [-2,147,483,648… 2,147,483,647]

### Examples

| **Input**          | **Output** |     | **Input**           | **Output** |
| ------------------ | ---------- | --- |-------------------- | ---------- |
| 10<br>20<br>3<br>3 | 30         |     | 15<br>14<br>2<br>3  | 42         |

## 2. Sum Digits

You will be given a single **integer**. Your task is to find the **sum of its digits**.

### Examples

| **Input** | **Output** |
| --------- | ---------- |
| 245678    | 32         |
| 97561     | 28         |
| 543       | 12         |

## 3. Elevator

Calculate how many courses will be needed to **elevate n persons** by using an elevator with **capacity of p persons**.
The input holds two lines:the **number of people n** and the **capacity p** of the elevator.

### Examples

| **Input** | **Output** | **Comments**                                                           |
| --------- | ---------- | ---------------------------------------------------------------------- |
| 173       | 6          | 5 courses \* 3 people + 1 course \* 2 persons                          |
| 45        | 1          | All the persons fit inside in the elevator. Only one course is needed. |
| 105       | 2          | 2 courses \* 5 people                                                  |

### Hints

- You should **divide**  **n**  **by**  **p**. This gives you the number of full courses (e.g. 17 / 3 = 5).
- If **n** does not divide **p** without a remainder, you will need one additional partially full course (e.g. 17 % 3 = 2).
- Another approach is to round up **n**** / ****p** to the nearest integer (ceiling), e.g. 17/3 = 5.67  rounds up to 6.
- Sample code for the round-up calculation:
 - &quot; **int courses = (int) Math.ceil((double) n / p);**

## 4. Sum of Chars

Write a program, which **sums the ASCII codes** of **n** characters.
Print the **sum** on the console.

### Input

- On the **first line**, you will receive** n **– the number of** lines **, which will follow**
- On the next **n lines** – you will receive letters from the **Latin** alphabet

### Output

Print the **total**** sum** in the following format:

**The sum equals: {totalSum}**

### Constraints

- **n** will be in the interval **[1…20]**.
- The **characters** will always be either **upper** or **lower** -case letters from the **English alphabet**
- You will always receive **one**** letter **per** line**

### Examples

| **Input**                      | **Output**          |     | **Input**                                                              | **Output**           |
| ------------------------------ | ------------------- | --- | ---------------------------------------------------------------------- | -------------------- |
| **5**<br>A<br>b<br>C<br>d<br>E | The sum equals: 399 |     | **12**<br>S<br>o<br>f<br>t<br>U<br>n<br>i<br>R<br>u<br>l<br>z<br>z<br> | The sum equals: 1263 |

## 5. Print Part of the ASCII Table

Find online more information about [ASCII](http://www.ascii-code.com/) (American Standard Code for Information Interchange) and write a program that **prints part of the ASCII table** of characters at the console.
On the **first line of input** you will receive **the char index you should start with** and on the
**second line - the index of the last character** you should print.

### Examples

| **Input** | **Output**                       |
| --------- | -------------------------------- |
| 6065      | < = > ? @ A                      |
| 6979      | E F G H I J K L M N O            |
| 97104     | a b c d e f g h                  |
| 4055      | ( ) \* + , - . / 0 1 2 3 4 5 6 7 |

## 6. Triples of Latin Letters

Write a program to read an integer **n** and print all **triples** of the first **n small Latin letters** , ordered alphabetically:

### Examples

| **Input** | **Output**                                                                                                                                                        |
| --------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 3         | aaa<br>aab<br>aac<br>aba<br>abb<br>abc<br>aca<br>acb<br>acc<br>baa<br>bab<br>bac<br>bba<br>bbb<br>bbc<br>bca<br>bcb<br>bcc<br>caa<br>cab<br>cac<br>cba<br>cbb<br>cbc<br>cca<br>ccb<br>ccc                                                                                                                                                                        |

### Hints

Perform 3 nested loops from **0** to **n-1**.
```java
 for (int i = 0; i < n; i++) {
     for (int j = 0; j < n; j++) {
         for (int k = 0; k < n; k++) {

         }
     }
 }
```

For each iteration generate new letters

![](RackMultipart20210205-4-gx5sfm_html_8d861a9e1477ef1d.png)

Concat all characters in a string and print it. You can use **String.format()**.

![](RackMultipart20210205-4-gx5sfm_html_59b6476105b43490.png)

1.
## Water Overflow

You have a **water**** tank **with capacity of** 255 liters**.
On the next **n** lines, you will receive **liters of water** , which you have to **pour** in your **tank**.
If the **capacity** is **not enough** , print &quot; **Insufficient capacity!**&quot; and **continue reading** the next line. On the last line, print the **liters** in the **tank**.

### Input

The **input** will be on two lines:

- On the **first**** line **, you will receive** n **– the number of** lines **, which will** follow**
- On the next **n lines** – you receive **quantities** of water, which you have to **pour** in the **tank**

### Output

Every time you do not have **enough**** capacity **in the tank to pour the given liters,** print**:

**Insufficient capacity!**

On the last line, **print** only the **liters** in the **tank**.

### Constraints

- **n** will be in the interval **[1…20]**
- **liters** will be in the interval **[1…1000]**

### Examples

| **Input** | **Output** |
 | **Input** | **Output** |
| --- | --- | --- | --- | --- |
| **5** 2010010010020 | Insufficient capacity!240 | **1** 1000
 | Insufficient capacity!0 |

| **Input** | **Output** |
 | **Input** | **Output** |
| --- | --- | --- | --- | --- |
| **7** 1020301051020 | 105 | **4** 250102040 | Insufficient capacity!Insufficient capacity!Insufficient capacity!250 |

1.
## Beer Kegs

Write a program, which calculates the volume of **n** beer kegs.
You will receive in total **3 \* n** lines. **Each three lines** will hold **information** for a **single** keg.
First up is the **model** of the keg, after that is the **radius** of the keg, and lastly is the **height** of the keg.

Calculate the volume using the following formula: **π \* r^2 \* h**.

At the end, print the **model** of the **biggest** keg.

### Input

You will receive **3 \* n** lines. Each group of lines will be on a new line:

- First – **model** – **string**.
- Second – **radius** – **floating-point** number
- Third – **height** – **integer** number

### Output

Print the **model** of the **biggest** keg.

### Constraints

- **n** will be in the interval **[1…10]**
- The **radius** will be a **floating-point number** in the interval **[1…3.402823E+38]**
- The **height** will be an **integer** in the interval **[1…2147483647]**

### Examples

| **Input** | **Output** |
 | **Input** | **Output** |
| --- | --- | --- | --- | --- |
| **3** Keg 11010Keg 22020Keg 31030 | Keg 2 |
 | **2** Smaller Keg2.4110Bigger Keg5.1220
 | Bigger Keg
 |

1.
## \*Spice Must Flow

_Spice is Love, Spice is Life. And most importantly, Spice must flow. It must be extracted from the scorching sands of Arrakis, under constant threat of giant sand worms. To make the work as efficient as possible, the Duke has tasked you with the creation of a management software._

Write a program that calculates the **total amount** of spice that can be extracted from a source.
The source has a **starting yield** , which indicates how much spice can be mined on the **first day**. After it has been mined for a day, the **yield drops** by 10, meaning on the second day it&#39;ll produce 10 less spice than on the first, on the third day 10 less than on the second, and so on (see examples).
A source is considered profitable only while its yield is **at least** 100 – when less than 100 spice is expected in a day, abandon the source.

The mining crew **consumes** 26 spice **every day** at the end of their shift and **an additional** 26 after the mine has been exhausted. Note that the workers cannot consume more spice than there is in storage.

When the operation is complete, print on the console on two separate lines how many days the mine has operated and the total amount of spice extracted.

### Input

You will receive a **number** , representing the **starting yield** of the source.

### Output

Print on the console on **two separate lines** how many **days** the mine has operated and the **total amount** of spice extracted.

### Constraints

- The starting yield will be a positive **integer** within range [0 … 2 147 483 647]

### Examples

| **Input** | **Output** | **Explanation** |
| --- | --- | --- |
| 111 | 2134 | **Day 1** we extract 111 spice and at the end of the shift, the workers consume 26, leaving 85. The yield drops by 10 to 101. **Day 2** we extract 101 spice, the workers consume 26, leaving 75. The total is 160 and the yield has dropped to 91. **Since** the expected yield is less than 100, we abandon the source. The workers take another 26, leaving 134. The mine has operated 2 days. |

1.
## \*Poke Mon

A Poke Mon is a special type of pokemon which likes to Poke others. But at the end of the day, the Poke Mon wants to keeps statistics, about how many pokes it has managed to make.

The Poke Mon pokes his target, and then proceeds to poke another target. The **distance** between his **targets**** reduces **his** poke power**.

You will be **given** the **poke power** the Poke Mon has, **N** – an **integer**.

Then you will be **given** the **distance** between the **poke targets** , **M** – an **integer**.

Then you will be **given** the **exhaustionFactor**** Y **– an** integer**.

Y ![](RackMultipart20210205-4-gx5sfm_html_eb7189780fa9dcc9.jpg) our task is to start **subtracting**** M **from** N **until** N **becomes** less than M**, i.e. the Poke Mon does not have enough power to reach the next target.
**Every time** you **subtract M** from **N** that means you&#39;ve reached a **target** and poked it successfully. **COUNT** how **many targets** you&#39;ve poked – **you&#39;ll need** that **count**.

The Poke Mon becomes gradually more exhausted. **IF**** N ****becomes equal** to **EXACTLY 50 %** of its **original value** , you must **divide**** N **by** Y **, if it is** POSSIBLE **.** This ****DIVISION** is between **integers**.

If a division is **not possible** , you should **NOT** do it. Instead, you should continue **subtracting**.

**After dividing** , you should **continue** subtracting from **N** , until it becomes **less** than **M**.

When **N** becomes **less** than **M** , you must take **what has remained** of **N** and the **count** of **targets** you&#39;ve poked, and print them as output.

**NOTE** : When you are **calculating percentages** , you should be **PRECISE** at **maximum**.

**Example** : **505** is **NOT EXACTLY 50 %** from **1000** , its **50.5 %**.

### Input

- The input consists of **3 lines**.
- On the **first line** you will receive **N** – an **integer**.
- On the **second line** you will receive **M** – an **integer**.
- On the **third line** you will receive **Y** – an **integer**.

### Output

- The output consists of **2 lines**.
- On the **first line** print **what has remained** of **N** , after **subtracting** from it.
- On the **second line** print the **count** of **targets** , you&#39;ve managed to poke.

### Constrains

- The integer **N** will be in the **range**** [1, 2.000.000.000]**.
- The integer **M** will be in the **range**** [1, 1.000.000]**.
- The integer **Y** will be in the **range**** [0, 9]**.
- Allowed time / memory: **16 MB / 100ms**.

### Examples

| **Input** | **Output** | **Comments** |
| --- | --- | --- |
| 523 | 12
 | N = 5, M = 2, Y = 3.We start **subtracting**** M **from** N **.** N – M = 3 **.** 1 **target poked.** N – M = 1 **.** 2 **targets poked.** N \&lt; M**.
We print **what has remained** of **N** , which is **1**.We print the **count of targets** , which is **2**. |
| 1052 | 21
 | N = 10, M = 5, Y = 2.We start **subtracting**** M **from** N **.** N ****–**** M **=** 5**. (N is still not less than M, they are equal).**N **became** EXACTLY ****50 %** of its **original value**. **5** is **50 %** from **10**. So we divide **N** by **Y**. **N / Y** = **5 / 2** = **2**. ( **INTEGER DIVISION** ). |

1.
## \*Snowballs

Tony and Andi love playing in the snow and having snowball fights, but they always argue which makes the best snowballs. Тhey have decided to involve you in their fray, by making you write a program which calculates snowball data, and outputs the best snowball value.

You will receive **N** – an **integer** , the **number** of **snowballs** being made by Tony and Andi.
**For each snowball** you will receive **3 input lines** :

- On the **first line** you will get the **snowballSnow** – an **integer**.
- On the **second line** you will get the **snowballTime** – an **integer**.
- On the **third line** you will get the **snowballQuality** – an **integer**.

**For each snowball** you must **calculate** its **snowballValue** by the following formula:

**(snowballSnow / snowballTime) ^ snowballQuality**

At the end you must print the **highest** calculated **snowballValue**.

### Input

- On the **first input line** you will receive **N** – the **number** of **snowballs**.
- On the **next N \* 3 input lines** you will be receiving **data** about **snowballs**.

### Output

- As output you must print the **highest** calculated **snowballValue** , by the formula, **specified above**.
- The output format is:
**{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})**

### Constraints

- The **number** of **snowballs** ( **N** ) will be an **integer** in **range [0, 100]**.
- The **snowballSnow** is an **integer** in **range [0, 1000]**.
- The **snowballTime** is an **integer** in **range [1, 500]**.
- The **snowballQuality** is an **integer** in **range [0, 100]**.

- Allowed working **time** / **memory** : **100ms** / **16MB**.

### Examples

| **Input** | **Output** |
| --- | --- |
| 21023555 | 10 : 2 = 125 (3) |
| 3105716422022 | 10 : 5 = 128 (7) |

![](RackMultipart20210205-4-gx5sfm_html_63c6245aa4940ad8.gif) ![](RackMultipart20210205-4-gx5sfm_html_5f0f2ddacbac70d2.gif) ![](RackMultipart20210205-4-gx5sfm_html_51bd00be29b85496.gif) ![](RackMultipart20210205-4-gx5sfm_html_f746d52952cd7e91.gif)[![](RackMultipart20210205-4-gx5sfm_html_3aa486326bfa75e9.png)](https://softuni.org/)

Follow us:

© SoftUni – [about.softuni.bg](https://about.softuni.bg/). Copyrighted document. Unauthorized copy, reproduction or use is not permitted.

[![](RackMultipart20210205-4-gx5sfm_html_9b17934bfedeb713.png)](https://softuni.org/)[![](RackMultipart20210205-4-gx5sfm_html_c9db196993f48ff8.png)](https://softuni.bg/)[![Software University @ Facebook](RackMultipart20210205-4-gx5sfm_html_94be3df36d913358.png)](https://www.facebook.com/softuni.org)[![](RackMultipart20210205-4-gx5sfm_html_7e8e605369b4ad74.png)](https://www.instagram.com/softuni_org)[![Software University @ Twitter](RackMultipart20210205-4-gx5sfm_html_ff9c629b0a21eb6b.png)](https://twitter.com/SoftUni1)[![Software University @ YouTube](RackMultipart20210205-4-gx5sfm_html_7db86a748da0e575.png)](https://www.youtube.com/channel/UCqvOk8tYzfRS-eDy4vs3UyA)[![](RackMultipart20210205-4-gx5sfm_html_95554caa563bbdb3.png)](https://www.linkedin.com/company/softuni/)[![](RackMultipart20210205-4-gx5sfm_html_4df51bfadcab813.png)](https://github.com/SoftUni)[![Software University: Email Us](RackMultipart20210205-4-gx5sfm_html_d7fa82ab7332f3fa.png)](mailto:info@softuni.org)

Page 10 of 10
