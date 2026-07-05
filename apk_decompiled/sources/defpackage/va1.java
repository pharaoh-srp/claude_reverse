package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class va1 {
    public Object a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public va1(Object obj, int i, Object obj2) {
        this.b = i;
        this.c = obj2;
        this.a = obj;
    }

    public final void a(Object obj, wn9 wn9Var, Object obj2) {
        wn9Var.getClass();
        Object obj3 = this.a;
        Object obj4 = this.c;
        int i = this.b;
        wn9Var.getClass();
        switch (i) {
            case 2:
                if (((k06) obj4).a) {
                    sz6.j("Cannot modify readonly DescriptorRendererOptions");
                }
                break;
        }
        this.a = obj2;
        wn9Var.getClass();
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                ((Boolean) obj3).getClass();
                Iterator it = ((wa1) obj4).b.iterator();
                while (it.hasNext()) {
                    ((bz7) it.next()).invoke(bool);
                }
                break;
            case 1:
                ((Boolean) obj2).getClass();
                ((Boolean) obj3).getClass();
                ((jq5) obj4).f();
                break;
        }
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}
