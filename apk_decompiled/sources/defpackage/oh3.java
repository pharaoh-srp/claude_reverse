package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class oh3 {
    public final String a;
    public List b = lm6.E;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public oh3(String str) {
        this.a = str;
    }

    public final void a(String str, SerialDescriptor serialDescriptor) {
        str.getClass();
        serialDescriptor.getClass();
        if (!this.d.add(str)) {
            StringBuilder sbX = sq6.x("Element with name '", str, "' is already registered in ");
            sbX.append(this.a);
            throw new IllegalArgumentException(sbX.toString().toString());
        }
        this.c.add(str);
        this.e.add(serialDescriptor);
        this.f.add(lm6.E);
        this.g.add(Boolean.FALSE);
    }
}
