.PHONY: all build run clean

all: build run clean

build:
	mkdir -p build
	javac -d build src/$(FILE).java

run:
	java -cp build $(FILE)

clean:
	rm -rf build/*
