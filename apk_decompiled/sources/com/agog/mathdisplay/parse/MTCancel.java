package com.agog.mathdisplay.parse;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.wg6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016J\b\u0010\u0013\u001a\u00020\u0000H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/agog/mathdisplay/parse/MTCancel;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "<init>", "()V", "innerList", "Lcom/agog/mathdisplay/parse/MTMathList;", "getInnerList", "()Lcom/agog/mathdisplay/parse/MTMathList;", "setInnerList", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", "cancelStyle", "Lcom/agog/mathdisplay/parse/MTCancelStyle;", "getCancelStyle", "()Lcom/agog/mathdisplay/parse/MTCancelStyle;", "setCancelStyle", "(Lcom/agog/mathdisplay/parse/MTCancelStyle;)V", "toLatexString", "", "copyDeep", "finalized", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTCancel extends MTMathAtom {
    private MTCancelStyle cancelStyle;
    private MTMathList innerList;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = mdj.f)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MTCancelStyle.values().length];
            try {
                iArr[MTCancelStyle.Diagonal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MTCancelStyle.BackDiagonal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MTCancelStyle.Cross.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MTCancel() {
        super(MTMathAtomType.KMTMathAtomCancel, "");
        this.cancelStyle = MTCancelStyle.Diagonal;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTCancel copyDeep() throws MathDisplayException {
        MTCancel mTCancel = new MTCancel();
        copyDeepContent(mTCancel);
        MTMathList mTMathList = this.innerList;
        mTCancel.innerList = mTMathList != null ? mTMathList.copyDeep() : null;
        mTCancel.cancelStyle = this.cancelStyle;
        return mTCancel;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTCancel finalized() throws MathDisplayException {
        MTCancel mTCancelCopyDeep = copyDeep();
        finalized(mTCancelCopyDeep);
        MTMathList mTMathList = mTCancelCopyDeep.innerList;
        mTCancelCopyDeep.innerList = mTMathList != null ? mTMathList.finalized() : null;
        return mTCancelCopyDeep;
    }

    public final MTCancelStyle getCancelStyle() {
        return this.cancelStyle;
    }

    public final MTMathList getInnerList() {
        return this.innerList;
    }

    public final void setCancelStyle(MTCancelStyle mTCancelStyle) {
        mTCancelStyle.getClass();
        this.cancelStyle = mTCancelStyle;
    }

    public final void setInnerList(MTMathList mTMathList) {
        this.innerList = mTMathList;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public String toLatexString() {
        String str;
        String latexString;
        int i = WhenMappings.$EnumSwitchMapping$0[this.cancelStyle.ordinal()];
        if (i == 1) {
            str = "cancel";
        } else if (i == 2) {
            str = "bcancel";
        } else {
            if (i != 3) {
                wg6.i();
                return null;
            }
            str = "xcancel";
        }
        MTMathList mTMathList = this.innerList;
        if (mTMathList == null || (latexString = MTMathListBuilder.INSTANCE.toLatexString(mTMathList)) == null) {
            latexString = "";
        }
        return ij0.l("\\", str, "{", latexString, "}");
    }
}
