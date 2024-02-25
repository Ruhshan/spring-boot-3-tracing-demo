package xyz.ruhshan.tracingspringboot3.common.dto;

import java.io.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {
    private String header;
    private String content;
}
