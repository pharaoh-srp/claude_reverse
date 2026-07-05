package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class rva extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ sva c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rva(sva svaVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = svaVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        sva svaVar = this.c;
        ColorStateList colorStateList2 = svaVar.N;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (svaVar.M != 0 && svaVar.N != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{x54.b(svaVar.N.getColorForState(iArr3, 0), svaVar.M), x54.b(svaVar.N.getColorForState(iArr2, 0), svaVar.M), svaVar.M});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            sva svaVar = this.c;
            Drawable rippleDrawable = null;
            if (svaVar.getText().toString().contentEquals(textView.getText()) && svaVar.M != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(svaVar.M);
                if (this.b != null) {
                    colorDrawable.setTintList(this.a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = mvi.a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
