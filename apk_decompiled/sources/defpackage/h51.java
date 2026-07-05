package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class h51 {
    public final nz8 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public h51(nz8 nz8Var) {
        this.a = nz8Var;
        i51 i51Var = i51.e;
        this.d = false;
    }

    public final void a() {
        j51 j51Var = j51.b;
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long j = j51Var.a;
        int i = 0;
        while (true) {
            nz8 nz8Var = this.a;
            if (i >= nz8Var.size()) {
                break;
            }
            m51 m51Var = (m51) nz8Var.get(i);
            m51Var.f(new j51(j));
            if (m51Var.c()) {
                j = m51Var.j(j);
                fd9.M(j >= 0);
                arrayList.add(m51Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((m51) arrayList.get(i2)).e();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((m51) this.b.get(b())).d() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= b()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    m51 m51Var = (m51) arrayList.get(i);
                    if (!m51Var.d()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : m51.a;
                        long jRemaining = byteBuffer2.remaining();
                        m51Var.g(byteBuffer2);
                        this.c[i] = m51Var.e();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < b()) {
                        ((m51) arrayList.get(i + 1)).i();
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h51)) {
            return false;
        }
        nz8 nz8Var = ((h51) obj).a;
        nz8 nz8Var2 = this.a;
        if (nz8Var2.size() != nz8Var.size()) {
            return false;
        }
        for (int i = 0; i < nz8Var2.size(); i++) {
            if (nz8Var2.get(i) != nz8Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
