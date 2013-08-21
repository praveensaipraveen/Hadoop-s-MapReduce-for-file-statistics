/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package directoryhadoop;

/**
 *
 * @author user
 */
import java.io.IOException;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Reducer;

public class DirectoryReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
    
    @Override
    public void reduce(Text key, Iterable<IntWritable> values,Context context) throws IOException,InterruptedException{
        int count=0;
       for(IntWritable i:values){            
            count+=i.get();
        }
        context.write(key,new IntWritable(count));
    }
}
