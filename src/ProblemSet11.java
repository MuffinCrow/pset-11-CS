import java.util.ArrayList;
import java.util.Arrays;

public class ProblemSet11 {

    public static void main(String[] args) {

    }

    public static ArrayList<String> fizzBuzz(int start, int end) {
        if (start < end) {
            int counter = start;
            ArrayList<String> temp = new ArrayList<>();

            while (counter < end) {
                if (counter % 3 == 0) {
                    if (counter % 5 == 0) {
                        temp.add("FizzBuzz");
                    } else {
                        temp.add("Fizz");
                    }
                } else if (counter % 5 == 0) {
                    temp.add("Buzz");
                } else {
                    temp.add(String.valueOf(counter));
                }
                counter++;
            }

            return temp;
        }
        return null;
    }

    public static int maxSpan(ArrayList<Integer> numbers) {
        if (numbers != null) {
            switch (numbers.size()) {
                case 0:
                case 1:
                    return numbers.size();
                default:
                    break;
            }

            int span = 1;
            for (int i = 0; i < numbers.size(); i++) {
                int num = numbers.get(i);

                for (int z = numbers.size() - 1; z > i; z--) {
                    if (numbers.get(z) == num && span < (z - i + 1)) {
                        span = z - i + 1;
                    }
                }
            }
            return span;
        }
        return -1;
    }

    public static ArrayList<Integer> fix34(ArrayList<Integer> numbers) {
        if (numbers != null) {
            ArrayList<Integer> fours = new ArrayList<>();
            ArrayList<Integer> threes = new ArrayList<>();

            for (int i = 0; i < numbers.size(); i++) {
                numbers.add(numbers.get(i));
                if (numbers.get(i) == 3) {
                    threes.add(i);
                } else if (numbers.get(i) == 4) {
                    fours.add(i);
                }
            }

            if (fours.size() == threes.size() && threes.get(0) < fours.get(0)) {
                boolean checkA = true;

                for (int i = 0; i < numbers.size() - 1; i++) {
                    if (numbers.get(i) == 3 && numbers.get(i + 1) == 3) {
                        checkA = false;
                    }
                }

                if (checkA) {
                    for (int i = 0; i < fours.size(); i++) {
                        numbers.remove(Integer.valueOf(4));
                    }
                    for (int i = 0; i < threes.size(); i++) {
                        numbers.remove(Integer.valueOf(3));
                    }
                    for (int i = 0; i < threes.size(); i++) {
                        numbers.add(threes.get(i), 3);
                        numbers.add(threes.get(i) + 1, 4);
                    }

                    return numbers;
                }
            }
        }
        return null;
    }

    public static ArrayList<Integer> fix45(ArrayList<Integer> numbers) {
        if (numbers != null) {
            ArrayList<Integer> fours = new ArrayList<>();
            ArrayList<Integer> fives = new ArrayList<>();

            for (int i = 0; i < numbers.size(); i++) {
                numbers.add(numbers.get(i));
                if (numbers.get(i) == 5) {
                    fives.add(i);
                } else if (numbers.get(i) == 4) {
                    fours.add(i);
                }
            }

            if (fours.size() == fives.size()) {
                boolean checkA = true;

                for (int i = 0; i < numbers.size() - 1; i++) {
                    if (numbers.get(i) == 4 && numbers.get(i + 1) == 4) {
                        checkA = false;
                    }
                }

                if (checkA) {
                    for (int i = 0; i < fours.size(); i++) {
                        numbers.remove(Integer.valueOf(4));
                    }
                    for (int i = 0; i < fives.size(); i++) {
                        numbers.remove(Integer.valueOf(5));
                    }
                    for (int i = 0; i < fives.size(); i++) {
                        numbers.add(fours.get(i), 4);
                        numbers.add(fours.get(i) + 1, 5);
                    }

                    return numbers;
                }
            }
        }
        return null;
    }

    public static boolean canBalance(ArrayList<Integer> numbers) {
        if (numbers != null && numbers.size() > 0) {
            for (int i = 0; i < numbers.size(); i++) {
                ArrayList<Integer> start = new ArrayList<Integer>(numbers.subList(0, i+1));
                ArrayList<Integer> end = new ArrayList<Integer>(numbers.subList(i+1, numbers.size()+1));

                int startSum = 0;
                int endSum = 0;

                for (int n : start) {
                    startSum += n;
                }

                for (int n : end) {
                    endSum += n;
                }

                if (startSum == endSum) return true;
            }
        }
        return false;
    }

    public static boolean linearIn(ArrayList<Integer> outer, ArrayList<Integer> inner) {
        if (outer != null && inner != null && outer.size() > 0 && inner.size() > 0) {
            for (int i = 0; i < inner.size() - 1; i++) {
                if (inner.get(i) > inner.get(i + 1))
                    return false;
            }
            for (int i = 0; i < outer.size() - 1; i++) {
                if (outer.get(i) > outer.get(i + 1)) {
                    return false;
                }
            }

            int check = 0;

            for (int i = 0; i < inner.size(); i++) {
                for (int z : outer) {
                    if (z == inner.get(i)) {
                        check++;
                        break;
                    }
                }
            }

            if (check < inner.size()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static ArrayList<Integer> squareUp(int n) {
        if (n >= 0) {
            if (n == 0) {
                ArrayList<Integer> output = new ArrayList<Integer>(0);
                return output;
            }

            ArrayList<Integer> output = new ArrayList<Integer>();

            for (int i = n; i > 0; i--) {
                int sub = i - 1;

                for (int z = 0; z < n; z++) {
                    if (sub > 0) {
                        output.add(0);
                    } else {
                        output.add(n - z);
                    }
                    sub--;
                }
            }
            return output;
        }
        return null;
    }

    public static ArrayList<Integer> seriesUp(int n) {
        if (n >= 0) {
            if (n == 0) {
                ArrayList<Integer> output = new ArrayList<Integer>(0);
                return output;
            }

            ArrayList<Integer> array = new ArrayList<Integer>();

            int length = 1;

            for (int i = 0; i < n; i++) {
                int count = 1;

                for (int z = 0; z < length; z++) {
                    array.add(count);
                    count++;
                }
                length++;
            }

            return array;
        }
        return null;
    }

    public static int maxMirror(ArrayList<Integer> numbers) {
        if (numbers != null) {
            int l1 = numbers.size();
            int l2 = l1;

            int[][] LCSuff = new int[l1 + 1][l2 + 1];
            int result = 0;

            for (int i = 0; i <= l1; i++) {
                for (int z = 0; z <= l2; z++) {
                    if (i == 0 || z == 0) {
                        LCSuff[i][z] = 0;
                    } else if (numbers.get(i - 1) == numbers.get(l2 - z)) {
                        LCSuff[i][z] = LCSuff[i-1][z-1] + 1;
                        result = Math.max(result, LCSuff[i][z]);
                    } else {
                        LCSuff[i][z] = 0;
                    }
                }
            }
            return result;
        }
        return -1;
    }

    public static int countClumps(ArrayList<Integer> numbers) {
        if (numbers != null) {
            int current = numbers.get(0);
            int past1 = current;
            int past2 = past1;
            int count = 0;

            if (numbers.get(0) == numbers.get(1)) count++;
            for (int i = 0; i < numbers.size(); i++) {
                past2 = past1;
                past1 = current;
                current = numbers.get(i);

                if (current == past1 && past1 != past2) {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }
}
