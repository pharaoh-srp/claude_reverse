package com.agog.mathdisplay.parse;

import defpackage.ij0;
import defpackage.mdj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u001cR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\b¨\u0006#"}, d2 = {"Lcom/agog/mathdisplay/parse/MTMathList;", "", "", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "alist", "<init>", "([Lcom/agog/mathdisplay/parse/MTMathAtom;)V", "", "(Ljava/util/List;)V", "atom", "", "isAtomAllowed", "(Lcom/agog/mathdisplay/parse/MTMathAtom;)Z", "Liei;", "addAtom", "(Lcom/agog/mathdisplay/parse/MTMathAtom;)V", "", "index", "insertAtom", "(Lcom/agog/mathdisplay/parse/MTMathAtom;I)V", "list", "append", "(Lcom/agog/mathdisplay/parse/MTMathList;)V", "", "toString", "()Ljava/lang/String;", "description", "finalized", "()Lcom/agog/mathdisplay/parse/MTMathList;", "copyDeep", "atoms", "Ljava/util/List;", "getAtoms", "()Ljava/util/List;", "setAtoms", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTMathList {
    private List<MTMathAtom> atoms;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = mdj.f)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MTMathAtomType.values().length];
            try {
                iArr[MTMathAtomType.KMTMathAtomBinaryOperator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomRelation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomPunctuation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomClose.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomNumber.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MTMathList(MTMathAtom... mTMathAtomArr) {
        mTMathAtomArr.getClass();
        this.atoms = new ArrayList();
        for (MTMathAtom mTMathAtom : mTMathAtomArr) {
            this.atoms.add(mTMathAtom);
        }
    }

    private final boolean isAtomAllowed(MTMathAtom atom) {
        return atom.getType() != MTMathAtomType.KMTMathAtomBoundary;
    }

    public final void addAtom(MTMathAtom atom) throws MathDisplayException {
        atom.getClass();
        if (!isAtomAllowed(atom)) {
            throw new MathDisplayException(ij0.j("Cannot add atom of type ", MTMathAtom.INSTANCE.typeToText(atom.getType()), " in a mathlist "));
        }
        this.atoms.add(atom);
    }

    public final void append(MTMathList list) {
        list.getClass();
        this.atoms.addAll(list.atoms);
    }

    public final MTMathList copyDeep() throws MathDisplayException {
        MTMathList mTMathList = new MTMathList(new MTMathAtom[0]);
        Iterator<MTMathAtom> it = this.atoms.iterator();
        while (it.hasNext()) {
            mTMathList.addAtom(it.next().copyDeep());
        }
        return mTMathList;
    }

    public final String description() {
        return toString();
    }

    public final MTMathList finalized() throws MathDisplayException {
        MTMathList mTMathList = new MTMathList(new MTMathAtom[0]);
        NSRange nSRange = new NSRange(0, 0);
        MTMathAtom mTMathAtom = null;
        for (MTMathAtom mTMathAtom2 : this.atoms) {
            MTMathAtom mTMathAtomFinalized = mTMathAtom2.finalized();
            if (nSRange.equal(mTMathAtom2.getIndexRange())) {
                mTMathAtomFinalized.setIndexRange(new NSRange(mTMathAtom == null ? 0 : mTMathAtom.getIndexRange().getLength() + mTMathAtom.getIndexRange().getLocation(), 1));
            }
            int i = WhenMappings.$EnumSwitchMapping$0[mTMathAtomFinalized.getType().ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    if (mTMathAtom != null && mTMathAtom.getType() == MTMathAtomType.KMTMathAtomBinaryOperator) {
                        mTMathAtom.setType(MTMathAtomType.KMTMathAtomUnaryOperator);
                    }
                } else if (i == 5 && mTMathAtom != null && mTMathAtom.getType() == MTMathAtomType.KMTMathAtomNumber && mTMathAtom.getSubScript() == null && mTMathAtom.getSuperScript() == null) {
                    mTMathAtom.fuse(mTMathAtomFinalized);
                }
            } else if (MTMathAtom.INSTANCE.isNotBinaryOperator(mTMathAtom)) {
                mTMathAtomFinalized.setType(MTMathAtomType.KMTMathAtomUnaryOperator);
            }
            mTMathList.addAtom(mTMathAtomFinalized);
            mTMathAtom = mTMathAtomFinalized;
        }
        if (mTMathAtom != null && mTMathAtom.getType() == MTMathAtomType.KMTMathAtomBinaryOperator) {
            mTMathAtom.setType(MTMathAtomType.KMTMathAtomUnaryOperator);
        }
        return mTMathList;
    }

    public final List<MTMathAtom> getAtoms() {
        return this.atoms;
    }

    public final void insertAtom(MTMathAtom atom, int index) throws MathDisplayException {
        atom.getClass();
        if (!isAtomAllowed(atom)) {
            throw new MathDisplayException(ij0.j("Cannot add atom of type ", MTMathAtom.INSTANCE.typeToText(atom.getType()), " in a mathlist "));
        }
        this.atoms.add(index, atom);
    }

    public final void setAtoms(List<MTMathAtom> list) {
        list.getClass();
        this.atoms = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<MTMathAtom> it = this.atoms.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        return sb.toString();
    }

    public MTMathList(List<MTMathAtom> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        this.atoms = arrayList;
        arrayList.addAll(list);
    }
}
