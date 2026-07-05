package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class fu7 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu7)) {
            return false;
        }
        fu7 fu7Var = (fu7) obj;
        return Objects.equals(this.a, fu7Var.a) && Objects.equals(this.b, fu7Var.b) && Objects.equals(this.c, fu7Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
