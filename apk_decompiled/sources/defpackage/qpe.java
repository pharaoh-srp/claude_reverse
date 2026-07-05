package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class qpe extends FileSystem {
    public static final Path J;
    public final ClassLoader G;
    public final FileSystem H;
    public final u0h I;

    static {
        String str = Path.F;
        J = Path.Companion.a("/");
    }

    public qpe(ClassLoader classLoader) {
        JvmSystemFileSystem jvmSystemFileSystem = FileSystem.E;
        jvmSystemFileSystem.getClass();
        this.G = classLoader;
        this.H = jvmSystemFileSystem;
        this.I = new u0h(new dg8(27, this));
    }

    public static String b0(Path path) {
        Path path2 = J;
        path2.getClass();
        path.getClass();
        return j.b(path2, path, true).d(path2).E.t();
    }

    @Override // okio.FileSystem
    public final List H(Path path) {
        path.getClass();
        String strB0 = b0(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.I.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            cpc cpcVar = (cpc) it.next();
            FileSystem fileSystem = (FileSystem) cpcVar.E;
            Path path2 = (Path) cpcVar.F;
            List listH = fileSystem.H(path2.e(strB0));
            if (listH != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listH) {
                    if (lja.e((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(x44.y(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(lja.o((Path) it2.next(), path2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                b54.t0(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (z) {
            return w44.p1(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    public final FileMetadata P(Path path) {
        path.getClass();
        if (!lja.e(path)) {
            return null;
        }
        String strB0 = b0(path);
        for (cpc cpcVar : (List) this.I.getValue()) {
            FileMetadata fileMetadataP = ((FileSystem) cpcVar.E).P(((Path) cpcVar.F).e(strB0));
            if (fileMetadataP != null) {
                return fileMetadataP;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public final FileHandle R(Path path) throws FileNotFoundException {
        path.getClass();
        if (!lja.e(path)) {
            throw new FileNotFoundException(grc.v("file not found: ", path));
        }
        String strB0 = b0(path);
        Iterator it = ((List) this.I.getValue()).iterator();
        while (it.hasNext()) {
            cpc cpcVar = (cpc) it.next();
            try {
                return ((FileSystem) cpcVar.E).R(((Path) cpcVar.F).e(strB0));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(grc.v("file not found: ", path));
    }

    @Override // okio.FileSystem
    public final Sink S(Path path, boolean z) throws IOException {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final Source T(Path path) throws IOException {
        path.getClass();
        if (!lja.e(path)) {
            throw new FileNotFoundException(grc.v("file not found: ", path));
        }
        Path path2 = J;
        path2.getClass();
        URL resource = this.G.getResource(j.b(path2, path, false).d(path2).E.t());
        if (resource == null) {
            throw new FileNotFoundException(grc.v("file not found: ", path));
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return Okio.g(inputStream);
    }

    @Override // okio.FileSystem
    public final Sink c(Path path) throws IOException {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final void d(Path path, Path path2) throws IOException {
        path.getClass();
        path2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final void f(Path path) throws IOException {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final void j(Path path, boolean z) throws IOException {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final List x(Path path) throws FileNotFoundException {
        String strB0 = b0(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (cpc cpcVar : (List) this.I.getValue()) {
            FileSystem fileSystem = (FileSystem) cpcVar.E;
            Path path2 = (Path) cpcVar.F;
            try {
                List listX = fileSystem.x(path2.e(strB0));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listX) {
                    if (lja.e((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(lja.o((Path) it.next(), path2));
                }
                b54.t0(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return w44.p1(linkedHashSet);
        }
        throw new FileNotFoundException(grc.v("file not found: ", path));
    }
}
