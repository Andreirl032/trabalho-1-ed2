
import sort.Sorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import java.lang.management.ManagementFactory;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

import java.lang.management.ManagementFactory;

public class Report {

    public static void write( String name_sorter, Sorter sorter ){
        LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofLocalizedDateTime( FormatStyle.FULL );
        String time_now = now.format( format );

        File report_file = new File( "./reports/" + sorter.getName() + ".txt" );

        String name = sorter.getName();
        long comparisons = sorter.getComparisons();
        long movements = sorter.getMovements();
        long executionTime = sorter.getExecutionTime();

        int hour, minutes, seconds;

        hour = (int) ( executionTime / ( 1000 * 60 * 60 ) );
        minutes = (int) ( executionTime / ( 1000 * 60 ) ) - hour * 60;
        seconds = (int) ( executionTime / ( 1000 ) ) - hour * 60 * 69 - minutes * 60;



    }

    private String soft_hard_content(){
        String userOS = "user.name";
        String nameOS = "os.name";
        String versionOS = "os.version";
        String architectureOS = "os.arch";

        String informationType = "The information about OS";

        String currentUsername = "Current username: " + System.getProperty( userOS );

        String name_OS = "Name of the OS: " + System.getProperty(nameOS);

        String version_OS = "Version of the OS: " + System.getProperty(versionOS);

        String architecture_OS = "Architecture of THe OS: " + System.getProperty(architectureOS);

        com.sun.management.OperatingSystemMXBean os = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

        /* Total number of processors or cores available to the JVM */
        String available_cores = "Available processors (cores): " + Runtime.getRuntime().availableProcessors();

        /* Total amount of free memory available to the JVM */
        String free_available_memory = "Free memory (bytes): " + ( Runtime.getRuntime().freeMemory() / ( 1024 * 1024 ) );

        /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory() / ( 1024 * 1024 );
        /* Maximum amount of memory the JVM will attempt to use */
        String maximum_memory = "Maximum memory (bytes): " + maxMemory;

        /* Total memory currently available to the JVM */
        String total_memory_available = "Total memory available to JVM (bytes): " + ( Runtime.getRuntime().totalMemory() / ( 1024 * 1024 ) );

        long physicalMemorySize = os.getTotalMemorySize() / ( 1024 * 1024 * 1024 );
        long freePhysicalMemory = os.getFreeMemorySize() / ( 1024 * 1024 );

        String total_RAM = "physicalMemorySize: " + physicalMemorySize;
        String free_RAM = "freePhysicalMemory: " + freePhysicalMemory;

        String pc_owner = switch (currentUsername) {
            case "alphinos" -> "Carlos Veras";
            case "Andrei" -> "Andrei Ramos";
            default -> "Desconhecido";
        };

        return "Este relatório foi gerado pelo computador de " + pc_owner;

    }

}
