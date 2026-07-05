package defpackage;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class fh1 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ File G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh1(File file, int i) {
        super(0);
        this.F = i;
        this.G = file;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        File file = this.G;
        switch (i) {
        }
        return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
    }
}
