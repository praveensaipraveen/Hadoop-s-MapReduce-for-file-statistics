package org.apache.hadoop.mapreduce.lib.output;

import java.io.IOException;
import java.text.NumberFormat;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.compress.CompressionCodec;
import org.apache.hadoop.mapred.FileAlreadyExistsException;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.OutputCommitter;
import org.apache.hadoop.mapreduce.OutputFormat;
import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.TaskInputOutputContext;

public abstract class FileOutputFormat<K extends Object, V extends Object> extends OutputFormat<K, V> {

    public enum Counter {

        BYTES_WRITTEN;

        private Counter() {
            //compiled code
            throw new RuntimeException("Compiled Code");
        }
    }
    protected static final String BASE_OUTPUT_NAME = "mapreduce.output.basename";
    protected static final String PART = "part";
    private static final NumberFormat NUMBER_FORMAT;
    private FileOutputCommitter committer;

    public FileOutputFormat() {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    public static void setCompressOutput(Job job, boolean compress) {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    public static boolean getCompressOutput(JobContext job) {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    public static void setOutputCompressorClass(Job job, Class<? extends CompressionCodec> codecClass) {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    public static Class<? extends CompressionCodec> getOutputCompressorClass(JobContext job, Class<? extends CompressionCodec> defaultValue) {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    public abstract RecordWriter<K, V> getRecordWriter(TaskAttemptContext tac) throws IOException, InterruptedException;

    public void checkOutputSpecs(JobContext jc) throws FileAlreadyExistsException, IOException {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    public static void setOutputPath(Job job, Path path) {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    public static Path getOutputPath(JobContext jc) {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    public static Path getWorkOutputPath(TaskInputOutputContext<?, ?, ?, ?> tioc) throws IOException, InterruptedException {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    public static Path getPathForWorkFile(TaskInputOutputContext<?, ?, ?, ?> tioc, String string, String string1) throws IOException, InterruptedException {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    public static synchronized String getUniqueFile(TaskAttemptContext tac, String string, String string1) {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    public Path getDefaultWorkFile(TaskAttemptContext tac, String string) throws IOException {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    protected static String getOutputName(JobContext jc) {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    protected static void setOutputName(JobContext jc, String string) {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }

    public synchronized OutputCommitter getOutputCommitter(TaskAttemptContext tac) throws IOException {
        //compiled code
        throw new RuntimeException("Compiled Code");
    }
}
