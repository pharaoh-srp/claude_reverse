package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes2.dex */
public final class rdb extends dh6 {
    public final int Q;
    public final int R;
    public zcb S;
    public adb T;

    public rdb(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.Q = 21;
            this.R = 22;
        } else {
            this.Q = 22;
            this.R = 21;
        }
    }

    @Override // defpackage.dh6, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        scb scbVar;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.S != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                scbVar = (scb) headerViewListAdapter.getWrappedAdapter();
            } else {
                scbVar = (scb) adapter;
                headersCount = 0;
            }
            adb item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= scbVar.getCount()) ? null : scbVar.getItem(i);
            adb adbVar = this.T;
            if (adbVar != item) {
                vcb vcbVar = scbVar.a;
                if (adbVar != null) {
                    this.S.d(vcbVar, adbVar);
                }
                this.T = item;
                if (item != null) {
                    this.S.t(vcbVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.Q) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.R) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (scb) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (scb) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(zcb zcbVar) {
        this.S = zcbVar;
    }

    @Override // defpackage.dh6, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
