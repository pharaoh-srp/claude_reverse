package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dkg implements zy5 {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public dkg(char c) {
        this.a = c;
    }

    @Override // defpackage.zy5
    public final int a(yy5 yy5Var, yy5 yy5Var2) {
        zy5 zy5Var;
        int size = yy5Var.a.size();
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                zy5Var = (zy5) linkedList.getFirst();
                break;
            }
            zy5Var = (zy5) it.next();
            if (zy5Var.c() <= size) {
                break;
            }
        }
        return zy5Var.a(yy5Var, yy5Var2);
    }

    @Override // defpackage.zy5
    public final char b() {
        return this.a;
    }

    @Override // defpackage.zy5
    public final int c() {
        return this.b;
    }

    @Override // defpackage.zy5
    public final char d() {
        return this.a;
    }

    public final void e(zy5 zy5Var) {
        int iC = zy5Var.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            zy5 zy5Var2 = (zy5) listIterator.next();
            int iC2 = zy5Var2.c();
            if (iC > iC2) {
                listIterator.previous();
                listIterator.add(zy5Var);
                return;
            } else if (iC == iC2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + iC + "; conflicting processors: " + zy5Var2 + ", " + zy5Var);
            }
        }
        linkedList.add(zy5Var);
        this.b = iC;
    }
}
