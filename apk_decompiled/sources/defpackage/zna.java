package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class zna {
    public final int a;
    public final aoa b;
    public final lz1 c;
    public int d;
    public int e;
    public int f;

    public zna(int i) {
        this.a = i;
        if (i <= 0) {
            gtk.f("maxSize <= 0");
            throw null;
        }
        this.b = new aoa(0);
        this.c = new lz1(21);
    }

    public Object a(Object obj) {
        obj.getClass();
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public final Object c(Object obj) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            aoa aoaVar = this.b;
            aoaVar.getClass();
            Object obj2 = aoaVar.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object objA = a(obj);
            if (objA == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    aoa aoaVar2 = this.b;
                    aoaVar2.getClass();
                    objPut = aoaVar2.a.put(obj, objA);
                    if (objPut != null) {
                        aoa aoaVar3 = this.b;
                        aoaVar3.getClass();
                        aoaVar3.a.put(obj, objPut);
                    } else {
                        this.d += f(obj, objA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                b(obj, objA, objPut);
                return objPut;
            }
            h(this.a);
            return objA;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        obj2.getClass();
        synchronized (this.c) {
            this.d += f(obj, obj2);
            aoa aoaVar = this.b;
            aoaVar.getClass();
            objPut = aoaVar.a.put(obj, obj2);
            if (objPut != null) {
                this.d -= f(obj, objPut);
            }
        }
        if (objPut != null) {
            b(obj, objPut, obj2);
        }
        h(this.a);
        return objPut;
    }

    public final Object e(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.c) {
            aoa aoaVar = this.b;
            aoaVar.getClass();
            objRemove = aoaVar.a.remove(obj);
            if (objRemove != null) {
                this.d -= f(obj, objRemove);
            }
        }
        if (objRemove != null) {
            b(obj, objRemove, null);
        }
        return objRemove;
    }

    public final int f(Object obj, Object obj2) {
        int iG = g(obj, obj2);
        if (iG >= 0) {
            return iG;
        }
        gtk.g("Negative size: " + obj + '=' + obj2);
        throw null;
    }

    public int g(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        defpackage.gtk.g("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r7) {
        /*
            r6 = this;
        L0:
            lz1 r0 = r6.c
            monitor-enter(r0)
            int r1 = r6.d     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 < 0) goto L64
            aoa r1 = r6.b     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            int r1 = r6.d     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L64
            goto L19
        L17:
            r6 = move-exception
            goto L6a
        L19:
            int r1 = r6.d     // Catch: java.lang.Throwable -> L17
            if (r1 <= r7) goto L62
            aoa r1 = r6.b     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L28
            goto L62
        L28:
            aoa r1 = r6.b     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L17
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L17
            r1.getClass()     // Catch: java.lang.Throwable -> L17
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = defpackage.w44.M0(r1)     // Catch: java.lang.Throwable -> L17
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L3f
            monitor-exit(r0)
            return
        L3f:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L17
            aoa r4 = r6.b     // Catch: java.lang.Throwable -> L17
            r4.getClass()     // Catch: java.lang.Throwable -> L17
            r3.getClass()     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r4 = r4.a     // Catch: java.lang.Throwable -> L17
            r4.remove(r3)     // Catch: java.lang.Throwable -> L17
            int r4 = r6.d     // Catch: java.lang.Throwable -> L17
            int r5 = r6.f(r3, r1)     // Catch: java.lang.Throwable -> L17
            int r4 = r4 - r5
            r6.d = r4     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            r6.b(r3, r1, r2)
            goto L0
        L62:
            monitor-exit(r0)
            return
        L64:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            defpackage.gtk.g(r6)     // Catch: java.lang.Throwable -> L17
            throw r2     // Catch: java.lang.Throwable -> L17
        L6a:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zna.h(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
