import sys

# Check if two arguments were passed
if len(sys.argv) < 3:
    print("Please provide two numbers as command-line arguments.")
    sys.exit(1)

# Get the arguments from the command line
x = sys.argv[1]
y = sys.argv[2]

# Convert the inputs to integers and calculate the sum
sum = int(x) + int(y)

# Print the sum
print("The sum is:", sum)
