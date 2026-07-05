package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class dh3 extends ikk {
    public final /* synthetic */ int b;
    public final /* synthetic */ Class c;
    public final /* synthetic */ Executable d;

    public /* synthetic */ dh3(Executable executable, Class cls, int i) {
        this.b = i;
        this.d = executable;
        this.c = cls;
    }

    @Override // defpackage.ikk
    public final Object m() {
        int i = this.b;
        Executable executable = this.d;
        switch (i) {
            case 0:
                return ((Constructor) executable).newInstance(null);
            default:
                return ((Method) executable).invoke(null, this.c, Object.class);
        }
    }

    public final String toString() {
        int i = this.b;
        Class cls = this.c;
        switch (i) {
        }
        return cls.getName();
    }
}
