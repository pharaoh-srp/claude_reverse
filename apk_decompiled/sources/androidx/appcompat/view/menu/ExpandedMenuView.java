package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.adb;
import defpackage.lrb;
import defpackage.ucb;
import defpackage.vcb;
import defpackage.ydb;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements ucb, ydb, AdapterView.OnItemClickListener {
    public static final int[] F = {R.attr.background, R.attr.divider};
    public vcb E;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        lrb lrbVarP = lrb.P(context, attributeSet, F, i);
        TypedArray typedArray = (TypedArray) lrbVarP.G;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(lrbVarP.y(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(lrbVarP.y(1));
        }
        lrbVarP.S();
    }

    @Override // defpackage.ucb
    public final boolean a(adb adbVar) {
        return this.E.q(adbVar, null, 0);
    }

    @Override // defpackage.ydb
    public final void b(vcb vcbVar) {
        this.E = vcbVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((adb) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
