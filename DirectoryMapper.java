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
import org.apache.hadoop.mapreduce.Mapper;

public class DirectoryMapper extends Mapper<LongWritable,Text,Text,IntWritable>{
    public void map(LongWritable key,Text value,Context context) throws IOException,InterruptedException{
        String line=value.toString();
        String op=null;
        op=line.substring(0,2);
        op+=" ";
        String fname=line.substring(line.lastIndexOf('\\'),line.length());
        int id=fname.lastIndexOf(".");
        if(id>0){            
            op+=fname.substring(id,fname.length());
        }
        else{
            op+="no extension";
        }
        context.write(new Text(op),new IntWritable(1));
    }
}
