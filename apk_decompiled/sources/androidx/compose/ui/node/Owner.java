package androidx.compose.ui.node;

import defpackage.av9;
import defpackage.b3d;
import defpackage.beg;
import defpackage.c45;
import defpackage.cv9;
import defpackage.cz5;
import defpackage.fu9;
import defpackage.ga8;
import defpackage.gea;
import defpackage.gf8;
import defpackage.h91;
import defpackage.jjh;
import defpackage.lb6;
import defpackage.m49;
import defpackage.m91;
import defpackage.mdj;
import defpackage.n91;
import defpackage.n9e;
import defpackage.omc;
import defpackage.op3;
import defpackage.ore;
import defpackage.ovi;
import defpackage.pp3;
import defpackage.rs7;
import defpackage.rt7;
import defpackage.s5;
import defpackage.sbj;
import defpackage.wkc;
import defpackage.wkh;
import defpackage.wt7;
import defpackage.y7d;
import defpackage.zjf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "", "av9", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public interface Owner {
    s5 getAccessibilityManager();

    h91 getAutofill();

    m91 getAutofillManager();

    n91 getAutofillTree();

    op3 getClipboard();

    pp3 getClipboardManager();

    c45 getCoroutineContext();

    cz5 getDensity();

    lb6 getDragAndDropManager();

    rs7 getFocusOwner();

    wt7 getFontFamilyResolver();

    rt7 getFontLoader();

    ga8 getGraphicsContext();

    gf8 getHapticFeedBack();

    m49 getInputModeManager();

    fu9 getLayoutDirection();

    gea getLocaleList();

    wkc getOutOfFrameExecutor();

    b3d getPlacementScope();

    y7d getPointerIconService();

    n9e getRectManager();

    ore getRetainedValuesStore();

    av9 getRoot();

    zjf getSemanticsOwner();

    cv9 getSharedDrawScope();

    boolean getShowLayoutBounds();

    omc getSnapshotObserver();

    beg getSoftwareKeyboardController();

    jjh getTextInputService();

    wkh getTextToolbar();

    ovi getViewConfiguration();

    sbj getWindowInfo();

    void setShowLayoutBounds(boolean z);
}
