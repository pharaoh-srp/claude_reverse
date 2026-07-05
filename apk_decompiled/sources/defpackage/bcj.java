package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bcj extends WindowInsetsAnimation$Callback {
    public final s34 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public bcj(s34 s34Var) {
        super(s34Var.E);
        this.d = new HashMap();
        this.a = s34Var;
    }

    public final ecj a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        ecj ecjVar = (ecj) map.get(windowInsetsAnimation);
        if (ecjVar != null) {
            return ecjVar;
        }
        ecj ecjVar2 = new ecj(0, null, 0L);
        ecjVar2.a = new ccj(windowInsetsAnimation);
        map.put(windowInsetsAnimation, ecjVar2);
        return ecjVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationN = a6.n(list.get(size));
            ecj ecjVarA = a(windowInsetsAnimationN);
            ecjVarA.a.e(windowInsetsAnimationN.getFraction());
            this.c.add(ecjVarA);
        }
        return this.a.c(bdj.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        cbf cbfVarD = this.a.d(a(windowInsetsAnimation), new cbf(bounds));
        cbfVarD.getClass();
        a6.s();
        return a6.l(((f59) cbfVarD.F).e(), ((f59) cbfVarD.G).e());
    }
}
