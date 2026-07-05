package defpackage;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes.dex */
public final class dh1 implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file == null) {
            return false;
        }
        String name = file.getName();
        name.getClass();
        return isg.t0(name) != null;
    }
}
