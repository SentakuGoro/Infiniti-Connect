package com.infiniticonnect.demo;
import android.appwidget.AppWidgetProvider;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.widget.RemoteViews;
public class InfoWidget extends AppWidgetProvider {
 @Override public void onUpdate(Context c,AppWidgetManager m,int[] ids){for(int id:ids){RemoteViews v=new RemoteViews(c.getPackageName(),android.R.layout.simple_list_item_2);v.setTextViewText(android.R.id.text1,"INFINITI CONNECT · DEMO");v.setTextViewText(android.R.id.text2,"Tank 68 %  ·  Reichweite 487 km");m.updateAppWidget(id,v);}}
}
