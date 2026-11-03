/*
It works perfectly because it is syntactically sound and complete, but your concern is 100% correct.
If a BlackRock interviewer asks you: "Walk me through the design choices you made here," or "Why did you use BigDecimal instead of Double?", you cannot just say, "An AI wrote it." You have to own the logic!
To make this project truly yours, you need to understand it inside out, modify it, and expand it with your own hands. Here is your roadmap to taking ownership of this code so it helps you land that internship.
## 🧠 Step 1: Prove You Understand It (The "Why")
If an interviewer asks about this code, here is what you must be able to say:

* Why did we use BigDecimal? Because binary computers cannot accurately calculate base-10 fractions (like $0.10 + $0.20 = $0.30000000000000004 using a regular double). Financial systems require absolute precision, which BigDecimal guarantees.
* Why use an enum? It creates type-safety. It restricts input values so nobody can accidentally create a transaction type called "MONEY_OUT" or type a typo like "DEPOSIIT".

## 🛠️ Step 2: Make It Yours (Your Homework Task)
Do not just leave the code as it is. I challenge you to add one simple feature by typing the code yourself. Let's add a Transaction Fee.
Every time someone makes an INVESTMENT, BlackRock charges a flat processing fee of $2.50.
Open your TransactionService.java file, look at the code, and try to add this logic inside the processTransaction method:

   1. Create a fee variable: BigDecimal fee = new BigDecimal("2.50");
   2. Inside the investment block, change the logic so it subtracts the amount PLUS the fee from the accountBalance.
   3. Update the print statement to show that a fee was charged.

## 📝 Step 3: Start the Next Phase Yourself
Remember the Portfolio Rebalancer project we discussed earlier? Let's start building it, but this time, you write the first lines of code.
Open a brand new file called Asset.java. Try to write a beginner-level class that represents an investment asset. It needs:

* A String name (e.g., "Apple Stock")
* A BigDecimal currentPrice

Try typing out that Asset class right now and paste your attempt into our chat. Do not worry about making mistakes or getting syntax errors—I will help you fix them, and that is exactly how you will learn to build the logic on your own!

 */