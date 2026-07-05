package defpackage;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class gp7 extends ActionMode.Callback2 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public gp7(ra4 ra4Var) {
        this.b = ra4Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ClipData.Item itemAt;
        CharSequence text;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ra4 ra4Var = (ra4) obj;
                ra4Var.getClass();
                menuItem.getClass();
                int itemId = menuItem.getItemId();
                if (itemId == 16908321) {
                    zy7 zy7Var = (zy7) ra4Var.G;
                    if (zy7Var != null) {
                        zy7Var.a();
                    }
                } else if (itemId == 16908322) {
                    zy7 zy7Var2 = (zy7) ra4Var.H;
                    if (zy7Var2 != null) {
                        zy7Var2.a();
                    }
                } else if (itemId == 16908320) {
                    zy7 zy7Var3 = (zy7) ra4Var.I;
                    if (zy7Var3 != null) {
                        zy7Var3.a();
                    }
                } else if (itemId == 16908319) {
                    zy7 zy7Var4 = (zy7) ra4Var.J;
                    if (zy7Var4 != null) {
                        zy7Var4.a();
                    }
                } else {
                    if (itemId != 16908355) {
                        return false;
                    }
                    zy7 zy7Var5 = (zy7) ra4Var.K;
                    if (zy7Var5 != null) {
                        zy7Var5.a();
                    }
                }
                if (actionMode == null) {
                    return true;
                }
                actionMode.finish();
                return true;
            default:
                lhe lheVar = (lhe) obj;
                actionMode.getClass();
                menuItem.getClass();
                int itemId2 = menuItem.getItemId();
                if (itemId2 == 0) {
                    zy7 zy7Var6 = lheVar.f;
                    if (zy7Var6 != null) {
                        zy7Var6.a();
                    }
                    actionMode.finish();
                    return true;
                }
                if (itemId2 == 1) {
                    zy7 zy7Var7 = lheVar.g;
                    if (zy7Var7 == null) {
                        return true;
                    }
                    zy7Var7.a();
                    return true;
                }
                if (itemId2 != 2) {
                    return false;
                }
                zy7 zy7Var8 = lheVar.f;
                if (zy7Var8 != null) {
                    zy7Var8.a();
                }
                Object systemService = lheVar.a.getContext().getSystemService("clipboard");
                systemService.getClass();
                ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
                String string = (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null) ? null : text.toString();
                if (string != null && !bsg.I0(string)) {
                    lheVar.b.invoke(string);
                }
                actionMode.finish();
                return true;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ra4 ra4Var = (ra4) obj;
                ra4Var.getClass();
                if (menu == null) {
                    sz6.p("onCreateActionMode requires a non-null menu");
                } else if (actionMode != null) {
                    if (((zy7) ra4Var.G) != null) {
                        ra4.b(menu, bdb.Copy);
                    }
                    if (((zy7) ra4Var.H) != null) {
                        ra4.b(menu, bdb.Paste);
                    }
                    if (((zy7) ra4Var.I) != null) {
                        ra4.b(menu, bdb.Cut);
                    }
                    if (((zy7) ra4Var.J) != null) {
                        ra4.b(menu, bdb.SelectAll);
                    }
                    if (((zy7) ra4Var.K) != null) {
                        ra4.b(menu, bdb.Autofill);
                    }
                } else {
                    sz6.p("onCreateActionMode requires a non-null mode");
                }
                break;
            default:
                actionMode.getClass();
                menu.getClass();
                lhe lheVar = (lhe) obj;
                if (lheVar.f != null) {
                    menu.add(0, 0, 0, R.string.copy);
                }
                if (lheVar.g != null) {
                    menu.add(0, 1, 1, R.string.selectAll);
                }
                if (lheVar.f != null) {
                    menu.add(0, 2, 2, com.anthropic.claude.R.string.text_selection_reply);
                }
                break;
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((l4) ((ra4) obj).E).a();
                break;
            default:
                actionMode.getClass();
                ((lhe) obj).c = null;
                break;
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                l9e l9eVar = (l9e) ((ra4) obj).F;
                if (rect != null) {
                    rect.set((int) l9eVar.a, (int) l9eVar.b, (int) l9eVar.c, (int) l9eVar.d);
                }
                break;
            default:
                actionMode.getClass();
                view.getClass();
                rect.getClass();
                l9e l9eVar2 = ((lhe) obj).e;
                rect.set((int) l9eVar2.a, (int) l9eVar2.b, (int) l9eVar2.c, (int) l9eVar2.d);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ra4 ra4Var = (ra4) this.b;
                ra4Var.getClass();
                if (actionMode == null || menu == null) {
                    return false;
                }
                ra4.c(menu, bdb.Copy, (zy7) ra4Var.G);
                ra4.c(menu, bdb.Paste, (zy7) ra4Var.H);
                ra4.c(menu, bdb.Cut, (zy7) ra4Var.I);
                ra4.c(menu, bdb.SelectAll, (zy7) ra4Var.J);
                ra4.c(menu, bdb.Autofill, (zy7) ra4Var.K);
                return true;
            default:
                actionMode.getClass();
                menu.getClass();
                return false;
        }
    }

    public gp7(lhe lheVar) {
        this.b = lheVar;
    }
}
