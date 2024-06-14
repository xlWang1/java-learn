package TimeAndDateApi;


public class TEst {
    public static void main(String[] args) {
        int[] nums = new int[2];
        nums[0] = 3;
        nums[1] = 3;

        int[] answer = test(nums, 6);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static int[] test(int[] nums,int target){
        int[] dis = new int[2];
        int temp = 1;
        for (int i = 0; i <= nums.length-2; i++) {
            for (int j = i+1; j <= nums.length-1; j++) {
                if (nums[i] + nums[j] == target){
                    dis[0] = i;
                    dis[1] = j;
                    break;
                }

            }

                    }
                return dis;
            }





}

