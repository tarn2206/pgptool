package org.pgptool.gui.tools.fileswatcher;

import java.nio.file.WatchEvent.Kind;

public interface FilesWatcherHandler {
	void handleFileChanged(Kind<?> entryDelete, String fileAbsolutePathname);
}