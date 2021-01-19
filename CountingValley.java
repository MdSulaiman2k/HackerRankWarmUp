class Result {
public static int countingValleys(int steps, String path) {
     int sealevel = 0 ;
    int cnt = 0 ;
      for(int i =0 ; i < steps ; i++){
          if(path.charAt(i) =='D'  && sealevel == 0){
              sealevel--;
              int j=i+1 ;
              for(; j<steps && sealevel != 0 ; j++){
                  if(path.charAt(j)=='U'){
                      sealevel++;
                  }
                  else{
                      sealevel--;
                  }
              }
              if(sealevel == 0 ){
                  cnt++;
              }
              i = j-1 ;
          }
          else if (path.charAt(i) =='D' )
                sealevel--;
          else if(path.charAt(i) =='U')
                sealevel++ ;
      }
      return cnt ;
    }
}
public class CountingValley{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
