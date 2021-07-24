package adapter_pattern.lesson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO{
	
	private static final long serialVersionUID = 1L;

	@Override
	public void readFromFile(String filename) throws IOException {
		Path path = Paths.get(filename);
		File file = path.toFile();
		FileReader reader = new FileReader(file);
		load(reader);
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		FileWriter writer = new FileWriter(filename);
		String comments = "written by FileProperties";
		store(writer, comments);
	}

	@Override
	public void setValue(String key, String value) {	
		put(key, value);
	}

	@Override
	public String getValue(String key) {
		String value = getProperty(key);
		return value;
	}

	
}
