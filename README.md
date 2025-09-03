# FlagQuiz: Test Your Global Knowledge

Challenge yourself with our exciting flag-guessing game! This mobile application will test your geography knowledge as you identify countries by their flags. Perfect for casual players who want to learn while having fun.

## 🚀 About The Project

FlagQuiz is an engaging Android application that presents users with a series of flags from around the world and challenges them to guess the corresponding country. It's a fun and educational game designed to be intuitive and enjoyable for everyone.

### Features

* [cite_start]**Randomized Quizzes:** Each game consists of 5 unique questions, with flags selected randomly from a pool of at least 10 countries to ensure a new experience every time[cite: 13, 14, 35].
* [cite_start]**Immediate Feedback:** After submitting an answer, the app provides instant feedback, letting you know if you were correct[cite: 26, 38]. [cite_start]If you were wrong, it reveals the right answer[cite: 45].
* [cite_start]**Scoring System:** Earn 20 points for every correct answer[cite: 16].
* [cite_start]**Detailed Results:** At the end of the quiz, view a comprehensive results screen displaying your final score and a summary of your performance[cite: 17, 29, 51].
* [cite_start]**Replayability:** Easily start a new game from the results screen to keep improving your geographical knowledge[cite: 19, 52].

## 🎮 How to Play

The game is designed to be simple and engaging:

1.  [cite_start]**Welcome Screen:** To begin, players enter their name on the welcome screen and tap "Start" to jump into the challenge[cite: 23, 24].
2.  [cite_start]**Quiz Screen:** For each of the 5 rounds, a flag will be displayed[cite: 10, 40, 43]. [cite_start]You'll need to type the name of the country into the text field (don't worry, it's case-insensitive)[cite: 11, 25, 95].
3.  [cite_start]**Results Screen:** After completing all 5 questions, you'll be taken to the results screen, which shows your name, final score, and a list of the questions you answered correctly or incorrectly[cite: 27, 28, 29].

## 🛠️ Technical Requirements

This application is built with the following specifications:

* **Three Activities:** The user experience is built across three main screens:
    1.  [cite_start]**Welcome Activity:** For player name input[cite: 23].
    2.  [cite_start]**Quiz Activity:** Displays the flags and input fields[cite: 25].
    3.  [cite_start]**Results Activity:** Shows the final score and summary[cite: 27].
* [cite_start]**Random & Unique Flag Selection:** The app randomly selects 5 unique flags from a collection of at least 10 different countries for each quiz session[cite: 35, 36, 93].
* **User Interface Elements:** Each question screen includes:
    * [cite_start]A question counter (e.g., "1 of 5")[cite: 42].
    * [cite_start]The flag image[cite: 43].
    * [cite_start]A text input field for the answer[cite: 44].
    * [cite_start]A message for immediate feedback[cite: 45].
    * [cite_start]A button to proceed to the next question[cite: 46].

### Implementation Details

* [cite_start]**Flag Images:** Standardized flag images are used from [https://flagicons.lipis.dev/](https://flagicons.lipis.dev/)[cite: 54, 55].
* [cite_start]**Image Naming Convention:** Flag images are saved in all lowercase with no spaces, following the format `flag_countryname.png` (e.g., `flag_brazil.png`)[cite: 61, 62, 63].
* **Android Development:**
    * [cite_start]Images are displayed using `ImageView`[cite: 96].
    * [cite_start]The minimum target API level is 28[cite: 121].

## 📋 Evaluation Criteria

The project will be evaluated based on the following criteria:

* **Technical Implementation:**
    * [cite_start]Correct implementation of the 3-activity navigation flow[cite: 92].
    * [cite_start]Proper random and unique selection of 5 flags[cite: 93].
    * [cite_start]Accurate scoring system (20 points per correct answer)[cite: 94].
    * [cite_start]Case-insensitive answer checking[cite: 95].
    * [cite_start]Appropriate use of `ImageView` for displaying flags[cite: 96].
* **User Experience:**
    * [cite_start]A clear and intuitive interface with proper instructions[cite: 98].
    * [cite_start]Appropriate feedback provided after each answer[cite: 99].
    * [cite_start]A detailed results screen with a question breakdown[cite: 100].
    * [cite_start]The ability to restart the game from the results screen[cite: 101].
    * [cite_start]Overall polish and attention to detail[cite: 102].

[cite_start]**Note:** This project is worth 10 points towards the final grade[cite: 20, 124].
