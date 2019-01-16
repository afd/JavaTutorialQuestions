import os

hexstrings = [ "ebc1", "5912", "6563" ] # Replace this example content with your own strings

for hex in hexstrings:
  question = "questions" + os.sep + hex + ".md"
  solution = "solutions" + os.sep + hex + ".md"

  question_string = "[Back to questions](../README.md)\n\n## " + hex + ": *TODO-name*\n\n"
  solution_string = "[Back to questions](../README.md)\n\n## Solution to [" + hex + "](../questions/" + hex + "): *TODO-name*\n\nSee code at `solutions/code/tutorialquestions/question" + hex + "`\n\n"

  with open(question, "w") as outfile:
    outfile.write(question_string)

  with open(solution, "w") as outfile:
    outfile.write(solution_string)


