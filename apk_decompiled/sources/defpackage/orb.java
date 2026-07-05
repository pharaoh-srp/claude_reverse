package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class orb {
    public final ArrayList a = new ArrayList();
    public final ArrayDeque b = new ArrayDeque();
    public boolean c;
    public final /* synthetic */ prb d;

    public orb(prb prbVar) {
        this.d = prbVar;
    }

    public final void a(gg9 gg9Var) {
        ((nrb) this.b.getLast()).d = gg9Var;
    }

    public final IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
        if (!this.c) {
            this.c = true;
            ArrayDeque arrayDeque = this.b;
            if (arrayDeque.size() != 1 || ((nrb) arrayDeque.getFirst()).b != null) {
                StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    nrb nrbVar = (nrb) itDescendingIterator.next();
                    sb.append("\nfor ");
                    Type type = nrbVar.a;
                    String str = nrbVar.b;
                    sb.append(type);
                    if (str != null) {
                        sb.append(' ');
                        sb.append(str);
                    }
                }
                return new IllegalArgumentException(sb.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    public final void c(boolean z) {
        this.b.removeLast();
        if (this.b.isEmpty()) {
            this.d.b.remove();
            if (z) {
                synchronized (this.d.c) {
                    try {
                        int size = this.a.size();
                        for (int i = 0; i < size; i++) {
                            nrb nrbVar = (nrb) this.a.get(i);
                            gg9 gg9Var = (gg9) this.d.c.put(nrbVar.c, nrbVar.d);
                            if (gg9Var != null) {
                                nrbVar.d = gg9Var;
                                this.d.c.put(nrbVar.c, gg9Var);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final gg9 d(Type type, String str, Object obj) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            ArrayDeque arrayDeque = this.b;
            if (i >= size) {
                nrb nrbVar = new nrb(type, str, obj);
                arrayList.add(nrbVar);
                arrayDeque.add(nrbVar);
                return null;
            }
            nrb nrbVar2 = (nrb) arrayList.get(i);
            if (nrbVar2.c.equals(obj)) {
                arrayDeque.add(nrbVar2);
                gg9 gg9Var = nrbVar2.d;
                return gg9Var != null ? gg9Var : nrbVar2;
            }
            i++;
        }
    }
}
