package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ui2 implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ ui2(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new String[512];
            case 1:
                return new char[FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM];
            case 2:
                return new ck6();
            case 3:
                return new char[2];
            case 4:
                return new SoftReference(new ArrayDeque());
            case 5:
                return new StringBuilder(FreeTypeConstants.FT_LOAD_NO_RECURSE);
            case 6:
                return new WeakHashMap();
            default:
                return new r5c(new ikh(""), c5c.class);
        }
    }
}
