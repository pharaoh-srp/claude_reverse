package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ckf {
    public static final /* synthetic */ wn9[] a = {new bwb(ckf.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new bwb(ckf.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new bwb(ckf.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new bwb(ckf.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new bwb(ckf.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new bwb(ckf.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new bwb(ckf.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new bwb(ckf.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new bwb(ckf.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new bwb(ckf.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new bwb(ckf.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new bwb(ckf.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new bwb(ckf.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new bwb(ckf.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new bwb(ckf.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new bwb(ckf.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new bwb(ckf.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new bwb(ckf.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new bwb(ckf.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new bwb(ckf.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new bwb(ckf.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new bwb(ckf.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new bwb(ckf.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new bwb(ckf.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new bwb(ckf.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new bwb(ckf.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new bwb(ckf.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new bwb(ckf.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new bwb(ckf.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new bwb(ckf.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new bwb(ckf.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new bwb(ckf.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        dkf dkfVar = akf.a;
        dkf dkfVar2 = ojf.a;
    }

    public static void a(ekf ekfVar, zy7 zy7Var) {
        ekfVar.a(ojf.u, new e5(null, zy7Var));
    }

    public static final void b(ekf ekfVar) {
        dkf dkfVar = akf.a;
        ekfVar.a(akf.j, iei.a);
    }

    public static void c(ekf ekfVar, zy7 zy7Var) {
        ekfVar.a(ojf.t, new e5(null, zy7Var));
    }

    public static void d(ekf ekfVar, bz7 bz7Var) {
        ekfVar.a(ojf.a, new e5(null, bz7Var));
    }

    public static final void e(ekf ekfVar) {
        dkf dkfVar = akf.a;
        ekfVar.a(akf.h, iei.a);
    }

    public static final void f(ekf ekfVar) {
        dkf dkfVar = akf.a;
        ekfVar.a(akf.q, iei.a);
    }

    public static final void g(ekf ekfVar, String str, zy7 zy7Var) {
        dkf dkfVar = ojf.a;
        ekfVar.a(ojf.b, new e5(str, zy7Var));
    }

    public static void h(ekf ekfVar, bz7 bz7Var) {
        ekfVar.a(ojf.h, new e5(null, bz7Var));
    }

    public static void i(ekf ekfVar, int i, zy7 zy7Var) {
        ekfVar.a(akf.J, new ty8(i));
        ekfVar.a(ojf.p, new e5(null, zy7Var));
    }

    public static final void j(ekf ekfVar, String str, zy7 zy7Var) {
        ekfVar.a(ojf.c, new e5(str, zy7Var));
    }

    public static final void k(ekf ekfVar, b10 b10Var) {
        dkf dkfVar = akf.s;
        wn9 wn9Var = a[9];
        ekfVar.a(dkfVar, b10Var);
    }

    public static final void l(ekf ekfVar, String str) {
        dkf dkfVar = akf.a;
        ekfVar.a(akf.a, x44.W(str));
    }

    public static final void m(ekf ekfVar, ro4 ro4Var) {
        dkf dkfVar = akf.a;
        dkf dkfVar2 = akf.r;
        wn9 wn9Var = a[8];
        ekfVar.a(dkfVar2, ro4Var);
    }

    public static final void n(ekf ekfVar, List list) {
        dkf dkfVar = ojf.a;
        dkf dkfVar2 = ojf.x;
        wn9 wn9Var = a[31];
        ekfVar.a(dkfVar2, list);
    }

    public static final void o(ekf ekfVar, g20 g20Var) {
        dkf dkfVar = akf.t;
        wn9 wn9Var = a[10];
        ekfVar.a(dkfVar, g20Var);
    }

    public static final void p(ekf ekfVar, int i) {
        dkf dkfVar = akf.k;
        wn9 wn9Var = a[3];
        ekfVar.a(dkfVar, sba.a(i));
    }

    public static final void q(ekf ekfVar, String str) {
        dkf dkfVar = akf.a;
        dkf dkfVar2 = akf.d;
        wn9 wn9Var = a[2];
        ekfVar.a(dkfVar2, str);
    }

    public static final void r(ekf ekfVar, mjd mjdVar) {
        dkf dkfVar = akf.a;
        dkf dkfVar2 = akf.c;
        wn9 wn9Var = a[1];
        ekfVar.a(dkfVar2, mjdVar);
    }

    public static final void s(ekf ekfVar, int i) {
        dkf dkfVar = akf.z;
        wn9 wn9Var = a[14];
        ekfVar.a(dkfVar, new vue(i));
    }

    public static final void t(ekf ekfVar, boolean z) {
        dkf dkfVar = akf.a;
        dkf dkfVar2 = akf.K;
        wn9 wn9Var = a[23];
        ekfVar.a(dkfVar2, Boolean.valueOf(z));
    }

    public static final void u(ekf ekfVar, e0g e0gVar) {
        dkf dkfVar = akf.a;
        dkf dkfVar2 = akf.S;
        wn9 wn9Var = a[30];
        ekfVar.a(dkfVar2, e0gVar);
    }

    public static final void v(ekf ekfVar, String str) {
        dkf dkfVar = akf.a;
        dkf dkfVar2 = akf.b;
        wn9 wn9Var = a[0];
        ekfVar.a(dkfVar2, str);
    }

    public static final void w(ekf ekfVar, zb0 zb0Var) {
        dkf dkfVar = akf.a;
        ekfVar.a(akf.C, x44.W(zb0Var));
    }

    public static final void x(ekf ekfVar, wrh wrhVar) {
        dkf dkfVar = akf.a;
        dkf dkfVar2 = akf.L;
        wn9 wn9Var = a[26];
        ekfVar.a(dkfVar2, wrhVar);
    }

    public static final void y(ekf ekfVar) {
        dkf dkfVar = akf.n;
        wn9 wn9Var = a[6];
        ekfVar.a(dkfVar, Boolean.TRUE);
    }
}
