package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class wpj implements Map, Serializable {
    public final /* synthetic */ int E;
    public final transient Object[] F;
    public transient AbstractCollection G;
    public transient AbstractCollection H;
    public transient AbstractCollection I;

    public /* synthetic */ wpj(int i, Object[] objArr) {
        this.E = i;
        this.F = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.E) {
            case 0:
                if (get(obj) != null) {
                }
                break;
            default:
                if (get(obj) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.E) {
            case 0:
                qpj qpjVar = (qpj) this.I;
                if (qpjVar == null) {
                    qpjVar = new qpj(1, this.F);
                    this.I = qpjVar;
                }
                return qpjVar.contains(obj);
            default:
                xpj xpjVar = (xpj) this.I;
                if (xpjVar == null) {
                    xpjVar = new xpj(1, this.F);
                    this.I = xpjVar;
                }
                return xpjVar.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.E) {
            case 0:
                g6l g6lVar = (g6l) this.G;
                if (g6lVar != null) {
                    return g6lVar;
                }
                g6l g6lVar2 = new g6l(this, this.F);
                this.G = g6lVar2;
                return g6lVar2;
            default:
                kpj kpjVar = (kpj) this.G;
                if (kpjVar != null) {
                    return kpjVar;
                }
                kpj kpjVar2 = new kpj(this, this.F);
                this.G = kpjVar2;
                return kpjVar2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.E) {
            case 0:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.E
            r1 = 0
            java.lang.Object[] r4 = r4.F
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L23;
                default: goto La;
            }
        La:
            if (r5 != 0) goto Le
        Lc:
            r4 = r2
            goto L1e
        Le:
            r0 = r4[r1]
            r0.getClass()
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto Lc
            r4 = r4[r3]
            r4.getClass()
        L1e:
            if (r4 != 0) goto L21
            goto L22
        L21:
            r2 = r4
        L22:
            return r2
        L23:
            if (r5 != 0) goto L27
        L25:
            r4 = r2
            goto L37
        L27:
            r0 = r4[r1]
            r0.getClass()
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L25
            r4 = r4[r3]
            r4.getClass()
        L37:
            if (r4 != 0) goto L3a
            goto L3b
        L3a:
            r2 = r4
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpj.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            default:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.E) {
            case 0:
                g6l g6lVar = (g6l) this.G;
                if (g6lVar == null) {
                    g6lVar = new g6l(this, this.F);
                    this.G = g6lVar;
                }
                Iterator it = g6lVar.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
            default:
                kpj kpjVar = (kpj) this.G;
                if (kpjVar == null) {
                    kpjVar = new kpj(this, this.F);
                    this.G = kpjVar;
                }
                Iterator it2 = kpjVar.iterator();
                int iHashCode2 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    iHashCode2 += next2 != null ? next2.hashCode() : 0;
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.E) {
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.E) {
            case 0:
                jpj jpjVar = (jpj) this.H;
                if (jpjVar != null) {
                    return jpjVar;
                }
                jpj jpjVar2 = new jpj(this, new qpj(0, this.F));
                this.H = jpjVar2;
                return jpjVar2;
            default:
                rpj rpjVar = (rpj) this.H;
                if (rpjVar != null) {
                    return rpjVar;
                }
                rpj rpjVar2 = new rpj(this, new xpj(0, this.F));
                this.H = rpjVar2;
                return rpjVar2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.E) {
        }
        return 1;
    }

    public final String toString() {
        boolean z = true;
        switch (this.E) {
            case 0:
                StringBuilder sb = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb.append('{');
                for (Map.Entry entry : (g6l) entrySet()) {
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb2.append('{');
                for (Map.Entry entry2 : (kpj) entrySet()) {
                    if (!z) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z = false;
                }
                sb2.append('}');
                return sb2.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.E) {
            case 0:
                qpj qpjVar = (qpj) this.I;
                if (qpjVar != null) {
                    return qpjVar;
                }
                qpj qpjVar2 = new qpj(1, this.F);
                this.I = qpjVar2;
                return qpjVar2;
            default:
                xpj xpjVar = (xpj) this.I;
                if (xpjVar != null) {
                    return xpjVar;
                }
                xpj xpjVar2 = new xpj(1, this.F);
                this.I = xpjVar2;
                return xpjVar2;
        }
    }
}
