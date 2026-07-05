package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b1h extends View {
    public final /* synthetic */ ViewGroup E;
    public final /* synthetic */ d1h F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1h(d1h d1hVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.F = d1hVar;
        this.E = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        d1h d1hVar = this.F;
        ArrayList arrayList = d1hVar.b;
        Drawable background = this.E.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (d1hVar.e != color) {
            d1hVar.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((trd) arrayList.get(size)).b(color);
            }
        }
    }
}
