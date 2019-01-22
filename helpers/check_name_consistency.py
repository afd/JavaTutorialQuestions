import glob
import os

# Checks whether names in questions match names in solutions.

for solution in glob.glob("solutions" + os.sep + "*.md"):
  hex = os.path.splitext(os.path.basename(solution))[0]
  solution_line_of_interest = open(solution, "r").readlines()[2]
  assert solution_line_of_interest.startswith("## Solution to [" + hex + "](../questions/" + hex + "): *")
  assert solution_line_of_interest.endswith("*\n")
  name_in_solution = solution_line_of_interest.split("*")[1]

  question_line_of_interest = open("questions" + os.sep + hex + ".md", "r").readlines()[2]
  assert question_line_of_interest.startswith("## " + hex + ": *")
  assert question_line_of_interest.endswith("*\n")
  name_in_question = question_line_of_interest.split("*")[1]
  assert(name_in_solution == name_in_question)
