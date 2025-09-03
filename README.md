# FlagQuiz: Test Your Global Knowledge

Challenge yourself with our exciting flag-guessing game! This mobile application will test your geography knowledge as you identify countries by their flags. Perfect for casual players who want to learn while having fun.

## 🚀 About The Project

FlagQuiz is an engaging Android application that presents users with a series of flags from around the world and challenges them to guess the corresponding country. It's a fun and educational game designed to be intuitive and enjoyable for everyone.

### Features

**Randomized Quizzes:** Each game consists of 5 unique questions, with flags selected randomly from a pool of at least 10 countries to ensure a new experience every time.
**Immediate Feedback:** After submitting an answer, the app provides instant feedback, letting you know if you were correct. If you were wrong, it reveals the right answer.
**Scoring System:** Earn 20 points for every correct answer.
**Detailed Results:** At the end of the quiz, view a comprehensive results screen displaying your final score and a summary of your performance.
**Replayability:** Easily start a new game from the results screen to keep improving your geographical knowledge.

## 🎮 How to Play

The game is designed to be simple and engaging:

1.  **Welcome Screen:** To begin, players enter their name on the welcome screen and tap "Start" to jump into the challenge.
2.  **Quiz Screen:** For each of the 5 rounds, a flag will be displayed.You'll need to type the name of the country into the text field (don't worry, it's case-insensitive).
3. **Results Screen:** After completing all 5 questions, you'll be taken to the results screen, which shows your name, final score, and a list of the questions you answered correctly or incorrectly.

## 🛠️ Technical Requirements

This application is built with the following specifications:

* **Three Activities:** The user experience is built across three main screens:
    1.  **Welcome Activity:** For player name input.
    2.  **Quiz Activity:** Displays the flags and input fields.
    3.  **Results Activity:** Shows the final score and summary.
  **Random & Unique Flag Selection:** The app randomly selects 5 unique flags from a collection of at least 10 different countries for each quiz session.
* **User Interface Elements:** Each question screen includes:
  A question counter (e.g., "1 of 5").
 The flag image.
  A text input field for the answer.
  A message for immediate feedback.
  A button to proceed to the next question.

### Implementation Details

**Flag Images:** Standardized flag images are used from [https://flagicons.lipis.dev/](https://flagicons.lipis.dev/).
**Image Naming Convention:** Flag images are saved in all lowercase with no spaces, following the format `flag_countryname.png` (e.g., `flag_brazil.png`).
* **Android Development:**
  Images are displayed using `ImageView`.
  The minimum target API level is 28.

## 📋 Evaluation Criteria

The project will be evaluated based on the following criteria:

* **Technical Implementation:**
    Correct implementation of the 3-activity navigation flow.
    Proper random and unique selection of 5 flags.
    Accurate scoring system (20 points per correct answer).
    Case-insensitive answer checking.
    Appropriate use of `ImageView` for displaying flags.
* **User Experience:**
    A clear and intuitive interface with proper instructions.
    Appropriate feedback provided after each answer.
    A detailed results screen with a question breakdown.
    The ability to restart the game from the results screen.
    Overall polish and attention to detail.
