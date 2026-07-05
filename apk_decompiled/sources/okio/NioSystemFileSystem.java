package okio;

import defpackage.mdj;
import defpackage.xh6;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.Metadata;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/NioSystemFileSystem;", "Lokio/JvmSystemFileSystem;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public class NioSystemFileSystem extends JvmSystemFileSystem {
    public static Long l0(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public FileMetadata P(Path path) {
        Path pathA;
        path.getClass();
        java.nio.file.Path path2 = Paths.get(path.E.t(), new String[0]);
        path2.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path2, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            java.nio.file.Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path2) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = Path.F;
                pathA = Path.Companion.a(symbolicLink.toString());
            } else {
                pathA = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lL0 = fileTimeCreationTime != null ? l0(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lL02 = fileTimeLastModifiedTime != null ? l0(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new FileMetadata(zIsRegularFile, zIsDirectory, pathA, lValueOf, lL0, lL02, fileTimeLastAccessTime != null ? l0(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void d(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        try {
            java.nio.file.Path path3 = Paths.get(path.E.t(), new String[0]);
            path3.getClass();
            java.nio.file.Path path4 = Paths.get(path2.E.t(), new String[0]);
            path4.getClass();
            Files.move(path3, path4, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            xh6.c("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // okio.JvmSystemFileSystem
    public String toString() {
        return "NioSystemFileSystem";
    }
}
