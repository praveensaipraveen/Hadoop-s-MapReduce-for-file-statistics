/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package directoryhadoop;

/**
 *
 * @author user
 */

import java.nio.file.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class DirectoryHadoop {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) throws Exception{
        if(args.length!=2){
            System.err.println("usage: DirectoryHadoop.jar <input path> <output path>");
            System.exit(-1);
        }
        
        Job job=new Job();
        job.setJarByClass(DirectoryHadoop.class);
        job.setJobName("Directory file count");
        
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        
        job.setMapperClass(DirectoryMapper.class);
        job.setCombinerClass(DirectoryReducer.class);
        job.setReducerClass(DirectoryReducer.class);
        
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        
        System.exit(job.waitForCompletion(true)?0:1);
    }
}
