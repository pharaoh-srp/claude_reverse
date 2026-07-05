package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ii2 {
    public static final HashMap c;
    public static final HashMap d;
    public final int a;
    public final int[] b;

    static {
        int[] iArr = {48, 57};
        int[] iArr2 = {9, 10, 12, 13, 32, 32};
        int[] iArr3 = {48, 57, 65, 90, 95, 95, 97, ModuleDescriptor.MODULE_VERSION};
        HashMap map = new HashMap();
        c = map;
        map.put("\\d", new ii2(1, iArr));
        map.put("\\D", new ii2(-1, iArr));
        map.put("\\s", new ii2(1, iArr2));
        map.put("\\S", new ii2(-1, iArr2));
        map.put("\\w", new ii2(1, iArr3));
        map.put("\\W", new ii2(-1, iArr3));
        int[] iArr4 = {48, 57, 65, 90, 97, ModuleDescriptor.MODULE_VERSION};
        int[] iArr5 = {65, 90, 97, ModuleDescriptor.MODULE_VERSION};
        int[] iArr6 = {0, 127};
        int[] iArr7 = {9, 9, 32, 32};
        int[] iArr8 = {0, 31, 127, 127};
        int[] iArr9 = {48, 57};
        int[] iArr10 = {33, 126};
        int[] iArr11 = {97, ModuleDescriptor.MODULE_VERSION};
        int[] iArr12 = {32, 126};
        int[] iArr13 = {33, 47, 58, 64, 91, 96, 123, 126};
        int[] iArr14 = {9, 13, 32, 32};
        int[] iArr15 = {65, 90};
        int[] iArr16 = {48, 57, 65, 90, 95, 95, 97, ModuleDescriptor.MODULE_VERSION};
        int[] iArr17 = {48, 57, 65, 70, 97, 102};
        HashMap map2 = new HashMap();
        d = map2;
        map2.put("[:alnum:]", new ii2(1, iArr4));
        map2.put("[:^alnum:]", new ii2(-1, iArr4));
        map2.put("[:alpha:]", new ii2(1, iArr5));
        map2.put("[:^alpha:]", new ii2(-1, iArr5));
        map2.put("[:ascii:]", new ii2(1, iArr6));
        map2.put("[:^ascii:]", new ii2(-1, iArr6));
        map2.put("[:blank:]", new ii2(1, iArr7));
        map2.put("[:^blank:]", new ii2(-1, iArr7));
        map2.put("[:cntrl:]", new ii2(1, iArr8));
        map2.put("[:^cntrl:]", new ii2(-1, iArr8));
        map2.put("[:digit:]", new ii2(1, iArr9));
        map2.put("[:^digit:]", new ii2(-1, iArr9));
        map2.put("[:graph:]", new ii2(1, iArr10));
        map2.put("[:^graph:]", new ii2(-1, iArr10));
        map2.put("[:lower:]", new ii2(1, iArr11));
        map2.put("[:^lower:]", new ii2(-1, iArr11));
        map2.put("[:print:]", new ii2(1, iArr12));
        map2.put("[:^print:]", new ii2(-1, iArr12));
        map2.put("[:punct:]", new ii2(1, iArr13));
        map2.put("[:^punct:]", new ii2(-1, iArr13));
        map2.put("[:space:]", new ii2(1, iArr14));
        map2.put("[:^space:]", new ii2(-1, iArr14));
        map2.put("[:upper:]", new ii2(1, iArr15));
        map2.put("[:^upper:]", new ii2(-1, iArr15));
        map2.put("[:word:]", new ii2(1, iArr16));
        map2.put("[:^word:]", new ii2(-1, iArr16));
        map2.put("[:xdigit:]", new ii2(1, iArr17));
        map2.put("[:^xdigit:]", new ii2(-1, iArr17));
    }

    public ii2(int i, int[] iArr) {
        this.a = i;
        this.b = iArr;
    }
}
