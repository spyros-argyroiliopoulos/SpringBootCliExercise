package com.codehub.spring.core.utilities;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.codehub.spring.core.domain.basic.Point;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

@Component
public class PointReader {

    public List<Point> readFile(String fileName) {
        try {
            CsvSchema bootstrapSchema = CsvSchema.emptySchema().withHeader();
            CsvMapper mapper = new CsvMapper();
            File file = new ClassPathResource(fileName).getFile();
            MappingIterator<Point> readValues =
                    mapper.readerWithSchemaFor(Point.class).with(bootstrapSchema).readValues(file);
            return readValues.readAll();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }}
