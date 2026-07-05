package io.sentry;

import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class l2 implements p3 {
    public final io.sentry.vendor.gson.stream.a E;
    public final ArrayDeque F = new ArrayDeque();
    public int G = 0;

    public l2(Reader reader) {
        this.E = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.p3
    public final Long A() {
        if (this.E.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(nextLong());
        }
        e();
        return null;
    }

    @Override // io.sentry.p3
    public final ArrayList E0(a1 a1Var, z1 z1Var) throws IOException {
        boolean z;
        io.sentry.vendor.gson.stream.a aVar = this.E;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            e();
            return null;
        }
        beginArray();
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (!aVar.hasNext()) {
                break;
            }
            k2 k2Var = new k2(this.G, aVar.peek());
            this.F.addLast(k2Var);
            try {
                try {
                    arrayList.add(z1Var.a(this, a1Var));
                } catch (Exception e) {
                    a1Var.d(t5.WARNING, "Failed to deserialize object in list.", e);
                    try {
                        f(k2Var);
                        z = true;
                    } catch (Exception e2) {
                        a1Var.d(t5.ERROR, "Stream unrecoverable, aborting list deserialization.", e2);
                        z = false;
                    }
                    if (!z) {
                        c(k2Var);
                        endArray();
                        return arrayList;
                    }
                }
                c(k2Var);
            } catch (Throwable th) {
                c(k2Var);
                throw th;
            }
        }
        endArray();
        return arrayList;
    }

    @Override // io.sentry.p3
    public final TimeZone G(a1 a1Var) {
        if (this.E.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            e();
            return null;
        }
        try {
            return TimeZone.getTimeZone(nextString());
        } catch (Exception e) {
            a1Var.d(t5.ERROR, "Error when deserializing TimeZone", e);
            return null;
        }
    }

    @Override // io.sentry.p3
    public final String I() {
        if (this.E.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return nextString();
        }
        e();
        return null;
    }

    @Override // io.sentry.p3
    public final HashMap M(a1 a1Var, z1 z1Var) throws IOException {
        boolean z;
        io.sentry.vendor.gson.stream.a aVar = this.E;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            e();
            return null;
        }
        beginObject();
        HashMap map = new HashMap();
        if (aVar.hasNext()) {
            while (true) {
                String strNextName = aVar.nextName();
                k2 k2Var = new k2(this.G, aVar.peek());
                this.F.addLast(k2Var);
                try {
                    try {
                        map.put(strNextName, z1Var.a(this, a1Var));
                    } catch (Exception e) {
                        a1Var.d(t5.WARNING, "Failed to deserialize object in map.", e);
                        try {
                            f(k2Var);
                            z = true;
                        } catch (Exception e2) {
                            a1Var.d(t5.ERROR, "Stream unrecoverable, aborting map deserialization.", e2);
                            z = false;
                        }
                        if (!z) {
                            c(k2Var);
                            break;
                        }
                        endObject();
                        return map;
                    }
                    c(k2Var);
                    if (aVar.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && aVar.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                } catch (Throwable th) {
                    c(k2Var);
                    throw th;
                }
            }
        }
        endObject();
        return map;
    }

    @Override // io.sentry.p3
    public final Double U() {
        if (this.E.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(nextDouble());
        }
        e();
        return null;
    }

    @Override // io.sentry.p3
    public final Date a0(a1 a1Var) throws IOException {
        if (this.E.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            e();
            return null;
        }
        String strNextString = nextString();
        if (strNextString == null) {
            return null;
        }
        try {
            try {
                return p.m(strNextString);
            } catch (Exception e) {
                a1Var.d(t5.ERROR, "Error when deserializing millis timestamp format.", e);
                return null;
            }
        } catch (Exception unused) {
            return p.n(strNextString);
        }
    }

    @Override // io.sentry.p3
    public final void beginArray() {
        this.E.beginArray();
        d();
        this.G++;
    }

    @Override // io.sentry.p3
    public final void beginObject() {
        this.E.beginObject();
        d();
        this.G++;
    }

    public final void c(k2 k2Var) {
        if (k2Var == null) {
            return;
        }
        ArrayDeque arrayDeque = this.F;
        if (arrayDeque.isEmpty() || arrayDeque.peekLast() != k2Var) {
            arrayDeque.remove(k2Var);
        } else {
            arrayDeque.removeLast();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E.close();
    }

    public final void d() {
        k2 k2Var = (k2) this.F.peekLast();
        if (k2Var != null) {
            k2Var.c = true;
        }
    }

    @Override // io.sentry.p3
    public final Boolean d0() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.E;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            e();
            return null;
        }
        boolean zJ = aVar.j();
        d();
        return Boolean.valueOf(zJ);
    }

    public final void e() {
        this.E.x();
        d();
    }

    @Override // io.sentry.p3
    public final void endArray() {
        this.E.endArray();
        this.G--;
    }

    @Override // io.sentry.p3
    public final void endObject() {
        this.E.endObject();
        this.G--;
    }

    public final void f(k2 k2Var) throws IOException {
        io.sentry.vendor.gson.stream.a aVar;
        while (true) {
            int i = this.G;
            int i2 = k2Var.a;
            aVar = this.E;
            if (i <= i2) {
                break;
            }
            io.sentry.vendor.gson.stream.b bVarPeek = aVar.peek();
            if (bVarPeek == io.sentry.vendor.gson.stream.b.END_OBJECT) {
                endObject();
            } else if (bVarPeek == io.sentry.vendor.gson.stream.b.END_ARRAY) {
                endArray();
            } else {
                skipValue();
            }
        }
        if (k2Var.c || aVar.peek() != k2Var.b) {
            return;
        }
        skipValue();
    }

    @Override // io.sentry.p3
    public final boolean hasNext() {
        return this.E.hasNext();
    }

    @Override // io.sentry.p3
    public final Float n0() {
        if (this.E.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Float.valueOf(nextFloat());
        }
        e();
        return null;
    }

    @Override // io.sentry.p3
    public final double nextDouble() throws IOException {
        double dNextDouble = this.E.nextDouble();
        d();
        return dNextDouble;
    }

    @Override // io.sentry.p3
    public final float nextFloat() throws IOException {
        double dNextDouble = this.E.nextDouble();
        d();
        return (float) dNextDouble;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    @Override // io.sentry.p3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int nextInt() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.l2.nextInt():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    @Override // io.sentry.p3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long nextLong() throws java.io.IOException {
        /*
            r11 = this;
            io.sentry.vendor.gson.stream.a r0 = r11.E
            int r1 = r0.L
            if (r1 != 0) goto La
            int r1 = r0.d()
        La:
            r2 = 15
            r3 = 0
            if (r1 != r2) goto L21
            r0.L = r3
            int[] r1 = r0.S
            int r2 = r0.Q
            int r2 = r2 + (-1)
            r3 = r1[r2]
            int r3 = r3 + 1
            r1[r2] = r3
            long r0 = r0.M
            goto Lad
        L21:
            r2 = 16
            r4 = 0
            java.lang.String r6 = "Expected a long but was "
            if (r1 != r2) goto L3e
            java.lang.String r1 = new java.lang.String
            char[] r2 = r0.G
            int r7 = r0.H
            int r8 = r0.N
            r1.<init>(r2, r7, r8)
            r0.O = r1
            int r1 = r0.H
            int r2 = r0.N
            int r1 = r1 + r2
            r0.H = r1
            goto L8b
        L3e:
            r2 = 10
            r7 = 8
            if (r1 == r7) goto L5f
            r8 = 9
            if (r1 == r8) goto L5f
            if (r1 != r2) goto L4b
            goto L5f
        L4b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r6)
            io.sentry.vendor.gson.stream.b r1 = r0.peek()
            r11.append(r1)
            java.lang.String r0 = r0.i()
            io.sentry.e0.h(r11, r0)
            return r4
        L5f:
            if (r1 != r2) goto L68
            java.lang.String r1 = r0.K()
            r0.O = r1
            goto L75
        L68:
            if (r1 != r7) goto L6d
            r1 = 39
            goto L6f
        L6d:
            r1 = 34
        L6f:
            java.lang.String r1 = r0.H(r1)
            r0.O = r1
        L75:
            java.lang.String r1 = r0.O     // Catch: java.lang.NumberFormatException -> L8b
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L8b
            r0.L = r3     // Catch: java.lang.NumberFormatException -> L8b
            int[] r7 = r0.S     // Catch: java.lang.NumberFormatException -> L8b
            int r8 = r0.Q     // Catch: java.lang.NumberFormatException -> L8b
            int r8 = r8 + (-1)
            r9 = r7[r8]     // Catch: java.lang.NumberFormatException -> L8b
            int r9 = r9 + 1
            r7[r8] = r9     // Catch: java.lang.NumberFormatException -> L8b
            r0 = r1
            goto Lad
        L8b:
            r1 = 11
            r0.L = r1
            java.lang.String r1 = r0.O
            double r1 = java.lang.Double.parseDouble(r1)
            long r7 = (long) r1
            double r9 = (double) r7
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb1
            r1 = 0
            r0.O = r1
            r0.L = r3
            int[] r1 = r0.S
            int r0 = r0.Q
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
            r0 = r7
        Lad:
            r11.d()
            return r0
        Lb1:
            java.lang.String r11 = r0.O
            java.lang.String r0 = r0.i()
            io.sentry.b2.e(r11, r0, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.l2.nextLong():long");
    }

    @Override // io.sentry.p3
    public final String nextName() {
        return this.E.nextName();
    }

    @Override // io.sentry.p3
    public final String nextString() throws IOException {
        String strNextString = this.E.nextString();
        d();
        return strNextString;
    }

    @Override // io.sentry.p3
    public final Object o0(a1 a1Var, z1 z1Var) {
        if (this.E.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return z1Var.a(this, a1Var);
        }
        e();
        return null;
    }

    @Override // io.sentry.p3
    public final io.sentry.vendor.gson.stream.b peek() {
        return this.E.peek();
    }

    @Override // io.sentry.p3
    public final void setLenient(boolean z) {
        this.E.F = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a3, code lost:
    
        r2.c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    @Override // io.sentry.p3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void skipValue() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.l2.skipValue():void");
    }

    @Override // io.sentry.p3
    public final Integer v() {
        if (this.E.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(nextInt());
        }
        e();
        return null;
    }

    @Override // io.sentry.p3
    public final Object v0() {
        j2 j2Var = new j2();
        int i = 0;
        boolean zC = false;
        while (!zC) {
            int[] iArr = c2.a;
            io.sentry.vendor.gson.stream.a aVar = this.E;
            int i2 = iArr[aVar.peek().ordinal()];
            ArrayList arrayList = j2Var.a;
            switch (i2) {
                case 1:
                    beginArray();
                    arrayList.add(new f2());
                    break;
                case 2:
                    endArray();
                    zC = j2Var.c();
                    break;
                case 3:
                    beginObject();
                    arrayList.add(new g2());
                    break;
                case 4:
                    endObject();
                    zC = j2Var.c();
                    break;
                case 5:
                    arrayList.add(new h2(aVar.nextName()));
                    break;
                case 6:
                    zC = j2Var.d(new a2(this, 0));
                    break;
                case 7:
                    zC = j2Var.d(new a2(j2Var, this));
                    break;
                case 8:
                    zC = j2Var.d(new a2(this, 2));
                    break;
                case 9:
                    e();
                    zC = j2Var.d(new b2(i));
                    break;
                case 10:
                    zC = true;
                    break;
            }
        }
        e2 e2VarA = j2Var.a();
        if (e2VarA != null) {
            return e2VarA.getValue();
        }
        return null;
    }

    @Override // io.sentry.p3
    public final void z(a1 a1Var, AbstractMap abstractMap, String str) throws Throwable {
        k2 k2Var;
        k2 k2Var2 = null;
        try {
            try {
                k2Var = new k2(this.G, this.E.peek());
                this.F.addLast(k2Var);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            abstractMap.put(str, v0());
            c(k2Var);
        } catch (Exception e2) {
            e = e2;
            k2Var2 = k2Var;
            a1Var.b(t5.ERROR, e, "Error deserializing unknown key: %s", str);
            if (k2Var2 != null) {
                try {
                    f(k2Var2);
                } catch (Exception e3) {
                    a1Var.d(t5.ERROR, "Stream unrecoverable after unknown key deserialization failure.", e3);
                }
            }
            c(k2Var2);
        } catch (Throwable th2) {
            th = th2;
            k2Var2 = k2Var;
            c(k2Var2);
            throw th;
        }
    }
}
