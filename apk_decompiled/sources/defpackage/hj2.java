package defpackage;

import com.anthropic.claude.sessions.types.GheSource;
import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.sessions.types.RepoWithStatus;
import com.anthropic.claude.tool.model.ChartDisplayV0InputSeriesItem;
import com.anthropic.claude.tool.model.ChartDisplayV0InputSeriesItemPointsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hj2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;

    public /* synthetic */ hj2(List list, int i) {
        this.E = i;
        this.F = list;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Object next;
        int i = this.E;
        lm6 lm6Var = lm6.E;
        boolean z = true;
        iei ieiVar = iei.a;
        List<ChartDisplayV0InputSeriesItem> list = this.F;
        switch (i) {
            case 0:
                j64 j64Var = (j64) obj;
                j64Var.getClass();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List<Double> values = ((ChartDisplayV0InputSeriesItem) it.next()).getValues();
                    if (values == null) {
                        values = lm6Var;
                    }
                    List<Double> list2 = values;
                    List listP1 = w44.p1(x44.L(list2));
                    ArrayList arrayList = j64Var.a;
                    List list3 = listP1;
                    List<Double> list4 = list2;
                    Iterator it2 = list3.iterator();
                    Iterator<T> it3 = list4.iterator();
                    ArrayList arrayList2 = new ArrayList(Math.min(x44.y(list3, 10), x44.y(list4, 10)));
                    while (it2.hasNext() && it3.hasNext()) {
                        arrayList2.add(new k64((Number) it2.next(), (Number) it3.next()));
                    }
                    arrayList.add(arrayList2);
                }
                return ieiVar;
            case 1:
                t5a t5aVar = (t5a) obj;
                t5aVar.getClass();
                for (ChartDisplayV0InputSeriesItem chartDisplayV0InputSeriesItem : list) {
                    List<Double> values2 = chartDisplayV0InputSeriesItem.getValues();
                    if (values2 != null && !values2.isEmpty()) {
                        List<Double> values3 = chartDisplayV0InputSeriesItem.getValues();
                        if (values3 == null) {
                            values3 = lm6Var;
                        }
                        List<Double> list5 = values3;
                        t5aVar.a(w44.p1(x44.L(list5)), list5);
                    }
                    List<ChartDisplayV0InputSeriesItemPointsItem> points = chartDisplayV0InputSeriesItem.getPoints();
                    if (points != null && !points.isEmpty()) {
                        List<ChartDisplayV0InputSeriesItemPointsItem> points2 = chartDisplayV0InputSeriesItem.getPoints();
                        if (points2 == null) {
                            points2 = lm6Var;
                        }
                        List<ChartDisplayV0InputSeriesItemPointsItem> list6 = points2;
                        ArrayList arrayList3 = new ArrayList(x44.y(list6, 10));
                        Iterator<T> it4 = list6.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(Double.valueOf(((ChartDisplayV0InputSeriesItemPointsItem) it4.next()).getX()));
                        }
                        List<ChartDisplayV0InputSeriesItemPointsItem> points3 = chartDisplayV0InputSeriesItem.getPoints();
                        if (points3 == null) {
                            points3 = lm6Var;
                        }
                        List<ChartDisplayV0InputSeriesItemPointsItem> list7 = points3;
                        ArrayList arrayList4 = new ArrayList(x44.y(list7, 10));
                        Iterator<T> it5 = list7.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(Double.valueOf(((ChartDisplayV0InputSeriesItemPointsItem) it5.next()).getY()));
                        }
                        t5aVar.a(arrayList3, arrayList4);
                    }
                }
                return ieiVar;
            case 2:
                t5a t5aVar2 = (t5a) obj;
                t5aVar2.getClass();
                Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    List<ChartDisplayV0InputSeriesItemPointsItem> points4 = ((ChartDisplayV0InputSeriesItem) it6.next()).getPoints();
                    if (points4 == null) {
                        points4 = lm6Var;
                    }
                    List<ChartDisplayV0InputSeriesItemPointsItem> list8 = points4;
                    ArrayList arrayList5 = new ArrayList(x44.y(list8, 10));
                    Iterator<T> it7 = list8.iterator();
                    while (it7.hasNext()) {
                        arrayList5.add(Double.valueOf(((ChartDisplayV0InputSeriesItemPointsItem) it7.next()).getX()));
                    }
                    ArrayList arrayList6 = new ArrayList(x44.y(list8, 10));
                    Iterator<T> it8 = list8.iterator();
                    while (it8.hasNext()) {
                        arrayList6.add(Double.valueOf(((ChartDisplayV0InputSeriesItemPointsItem) it8.next()).getY()));
                    }
                    t5aVar2.a(arrayList5, arrayList6);
                }
                return ieiVar;
            case 3:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.n(ekfVar, list);
                return ieiVar;
            case 4:
                mtc mtcVar = (mtc) obj;
                mtcVar.getClass();
                if (!list.isEmpty()) {
                    list.set(list.size() - 1, mtcVar);
                }
                return ieiVar;
            case 5:
                return ((rvh) list.get(((Integer) obj).intValue())).a;
            case 6:
                jg9 jg9Var = (jg9) obj;
                jg9Var.getClass();
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    jg9Var.a(ch9.c((String) it9.next()));
                }
                return ieiVar;
            case 7:
                lhf lhfVar = (lhf) obj;
                lhfVar.getClass();
                GitHubRepo gitHubRepo = lhfVar.a;
                Iterator it10 = list.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        if (x44.r(((RepoWithStatus) next).getRepo().getId(), gitHubRepo.getId())) {
                        }
                    } else {
                        next = null;
                    }
                }
                RepoWithStatus repoWithStatus = (RepoWithStatus) next;
                if (repoWithStatus != null) {
                    gitHubRepo.setSourceUrl(repoWithStatus.getSource_url());
                    GheSource ghe = repoWithStatus.getGhe();
                    gitHubRepo.setGheConfigurationId(ghe != null ? Integer.valueOf(ghe.getConfiguration_id()) : null);
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                j0aVar.W(list.size(), new z04(new oua(25), 29, list), new tq(list, 26), new ta4(2039820996, true, new fr0(list, 4, list)));
                return ieiVar;
            default:
                ova ovaVar = (ova) obj;
                ovaVar.getClass();
                return (CharSequence) list.get(Integer.parseInt((String) ((mva) ovaVar.a()).get(1)) - 1);
        }
    }
}
