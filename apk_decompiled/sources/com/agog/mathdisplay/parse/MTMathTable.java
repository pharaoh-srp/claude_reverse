package com.agog.mathdisplay.parse;

import defpackage.mdj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\t\u0010\bJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR.\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001b0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0006R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.¨\u00062"}, d2 = {"Lcom/agog/mathdisplay/parse/MTMathTable;", "Lcom/agog/mathdisplay/parse/MTMathAtom;", "<init>", "()V", "", "env", "(Ljava/lang/String;)V", "copyDeep", "()Lcom/agog/mathdisplay/parse/MTMathTable;", "finalized", "Lcom/agog/mathdisplay/parse/MTMathList;", "list", "", "row", "column", "Liei;", "setCell", "(Lcom/agog/mathdisplay/parse/MTMathList;II)V", "Lcom/agog/mathdisplay/parse/MTColumnAlignment;", "alignment", "setAlignment", "(Lcom/agog/mathdisplay/parse/MTColumnAlignment;I)V", "getAlignmentForColumn", "(I)Lcom/agog/mathdisplay/parse/MTColumnAlignment;", "numColumns", "()I", "numRows", "", "alignments", "Ljava/util/List;", "cells", "getCells", "()Ljava/util/List;", "setCells", "(Ljava/util/List;)V", "environment", "Ljava/lang/String;", "getEnvironment", "()Ljava/lang/String;", "setEnvironment", "", "interColumnSpacing", "F", "getInterColumnSpacing", "()F", "setInterColumnSpacing", "(F)V", "interRowAdditionalSpacing", "getInterRowAdditionalSpacing", "setInterRowAdditionalSpacing", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTMathTable extends MTMathAtom {
    private List<MTColumnAlignment> alignments;
    private List<List<MTMathList>> cells;
    private String environment;
    private float interColumnSpacing;
    private float interRowAdditionalSpacing;

    public MTMathTable() {
        super(MTMathAtomType.KMTMathAtomTable, "");
        this.alignments = new ArrayList();
        this.cells = new ArrayList();
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTMathTable copyDeep() throws MathDisplayException {
        MTMathTable mTMathTable = new MTMathTable(this.environment);
        copyDeepContent(mTMathTable);
        ArrayList arrayList = new ArrayList();
        mTMathTable.alignments = arrayList;
        arrayList.addAll(this.alignments);
        mTMathTable.cells = new ArrayList();
        for (List<MTMathList> list : this.cells) {
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(list.get(i).copyDeep());
            }
            mTMathTable.cells.add(arrayList2);
        }
        mTMathTable.interColumnSpacing = this.interColumnSpacing;
        mTMathTable.interRowAdditionalSpacing = this.interRowAdditionalSpacing;
        return mTMathTable;
    }

    @Override // com.agog.mathdisplay.parse.MTMathAtom
    public MTMathTable finalized() throws MathDisplayException {
        MTMathTable mTMathTableCopyDeep = copyDeep();
        finalized(mTMathTableCopyDeep);
        for (List<MTMathList> list : mTMathTableCopyDeep.cells) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.set(i, list.get(i).finalized());
            }
        }
        return mTMathTableCopyDeep;
    }

    public final MTColumnAlignment getAlignmentForColumn(int column) {
        return this.alignments.size() <= column ? MTColumnAlignment.KMTColumnAlignmentCenter : this.alignments.get(column);
    }

    public final List<List<MTMathList>> getCells() {
        return this.cells;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final float getInterColumnSpacing() {
        return this.interColumnSpacing;
    }

    public final float getInterRowAdditionalSpacing() {
        return this.interRowAdditionalSpacing;
    }

    public final int numColumns() {
        Iterator<List<MTMathList>> it = this.cells.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().size());
        }
        return iMax;
    }

    public final int numRows() {
        return this.cells.size();
    }

    public final void setAlignment(MTColumnAlignment alignment, int column) {
        alignment.getClass();
        if (this.alignments.size() <= column) {
            for (int size = this.alignments.size(); size <= column; size++) {
                this.alignments.add(size, MTColumnAlignment.KMTColumnAlignmentCenter);
            }
        }
        this.alignments.set(column, alignment);
    }

    public final void setCell(MTMathList list, int row, int column) {
        list.getClass();
        if (this.cells.size() <= row) {
            for (int size = this.cells.size(); size <= row; size++) {
                this.cells.add(size, new ArrayList());
            }
        }
        List<MTMathList> list2 = this.cells.get(row);
        if (list2.size() <= column) {
            for (int size2 = list2.size(); size2 <= column; size2++) {
                list2.add(size2, new MTMathList(new MTMathAtom[0]));
            }
        }
        list2.set(column, list);
    }

    public final void setCells(List<List<MTMathList>> list) {
        list.getClass();
        this.cells = list;
    }

    public final void setEnvironment(String str) {
        this.environment = str;
    }

    public final void setInterColumnSpacing(float f) {
        this.interColumnSpacing = f;
    }

    public final void setInterRowAdditionalSpacing(float f) {
        this.interRowAdditionalSpacing = f;
    }

    public MTMathTable(String str) {
        this();
        this.environment = str;
    }
}
