package com.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// 食譜
		// RcpService rcpService = context.getBean(RcpService.class);
		// Get all recipes
		// List<RecipeVO> list = rcpService.getAll();
		// if (list != null) {
		// for (RecipeVO recipe : list) {
		// System.out.print(recipe.getRcpSeq() + ",");
		// System.out.print(recipe.getrName() + ",");
		// System.out.print(recipe.getCookTime() + ",");
		// System.out.print(recipe.getCookWayNo() + ",");
		// System.out.print(recipe.getCreateDt() + ",");
		// System.out.print(recipe.getKindNo() + ",");
		// System.out.print(recipe.getServing() + ",");
		// System.out.println(recipe.getNote());
		// System.out.println("---------------------");
		// }
		// }

		// get one recipe
		// RecipeVO data = new RecipeVO();
		// data.setRcpSeq(7004);

		// RecipeVO recipe = rcpService.findByPk(data);
		// System.out.print(recipe.getRcpSeq() + ",");
		// System.out.print(recipe.getrName() + ",");
		// System.out.print(recipe.getCookTime() + ",");
		// System.out.print(recipe.getCookWayNo() + ",");
		// System.out.print(recipe.getCreateDt() + ",");
		// System.out.print(recipe.getKindNo() + ",");
		// System.out.print(recipe.getServing() + ",");
		// System.out.println(recipe.getNote());
		// System.out.println("---------------------");

		// delete recipe
		// System.out.println("delete開始...");
		// rcpService.delete(data);
		// System.out.println("delete完成...");

		// RecipeVO recipe = rcpService.findByPk(data);
		// System.out.print(recipe.getRcpSeq() + ",");
		// System.out.print(recipe.getrName() + ",");
		// System.out.print(recipe.getCookTime() + ",");
		// System.out.print(recipe.getCookWayNo() + ",");
		// System.out.print(recipe.getCreateDt() + ",");
		// System.out.print(recipe.getKindNo() + ",");
		// System.out.print(recipe.getServing() + ",");
		// System.out.println(recipe.getNote());
		// System.out.println("---------------------");

		// add recipe
		// RecipeVO data = new RecipeVO();
		// data.setrName("紅油炒手");
		// data.setCookTime(15);
		// data.setCookWayNo("A");
		// data.setCreateDt(java.sql.Date.valueOf("2002-01-01"));
		// data.setKindNo("1R2");
		// data.setServing(1);
		// data.setNote("簡介...");
		// data.setTrick("小撇不");
		// rcpService.addRcpData(data);
		// System.out.println("新增完成...");

		// update recipe
		// RecipeVO data = new RecipeVO();
		// data.setRcpSeq(7003);
		// data.setrName("黑森林蛋糕");
		// data.setCookTime(15);
		// data.setCookWayNo("E");
		// data.setCreateDt(java.sql.Date.valueOf("2017-06-22"));
		// data.setKindNo("1R2");
		// data.setServing(1);
		// data.setNote("This is a cake...");
		// data.setTrick("skills...");
		// rcpService.update(data);
		// System.out.println("update完成...");

		// findByCritieria
		// Map<String, String[]> map = new HashMap<String, String[]>();
		// String data[] = {"起司"};
		// map.put("rName", data);
		// List<RecipeVO> list = rcpService.findByCriteria(map);
		// for(RecipeVO recipe:list){
		// System.out.print(recipe.getRcpSeq() + ",");
		// System.out.print(recipe.getrName() + ",");
		// System.out.print(recipe.getCookTime() + ",");
		// System.out.print(recipe.getCookWayNo() + ",");
		// System.out.print(recipe.getCreateDt() + ",");
		// System.out.print(recipe.getKindNo() + ",");
		// System.out.print(recipe.getServing() + ",");
		// System.out.println(recipe.getNote());
		// System.out.println("---------------------");
		// }

		// 種類名稱
//		KindCodeService kindCodeService = context.getBean(KindCodeService.class);
//
//		List<KindCodeVO> list = kindCodeService.getAll();
//
//		for (KindCodeVO kindCodeVOs : list) {
//			System.out.print(kindCodeVOs.getKindName() + ",");
//			System.out.print(kindCodeVOs.getKindNo());
//			System.out.println("---------------------");
//		}

		// 料理方式
		// CookWayCodeService cookWayCodeService =
		// context.getBean(CookWayCodeService.class);
		// List<CookWayCodeVO> list = cookWayCodeService.getAll();
		// for (CookWayCodeVO cookWayCodeVO : list) {
		// System.out.print(cookWayCodeVO.getCookWayName() + ",");
		// System.out.print(cookWayCodeVO.getCookWayNo());
		// System.out.println("---------------------");
		// }

		// 食材
		// IngreService ingreService = context.getBean(IngreService.class);

		// RecipeVO recipeVO = new RecipeVO();
		//
		// recipeVO.setRcpSeq(7001);
		//
		// List<IngredientVO> list = ingreService.findByRcpSeq(recipeVO);
		//
		// for (IngredientVO ingredientVO : list) {
		// System.out.print(ingredientVO.getRcpSeq() + ",");
		// System.out.print(ingredientVO.getiName() + ",");
		// System.out.print(ingredientVO.getQuantity());
		// System.out.println("---------------------");
		// }

		// 查詢幾個組別
		// List<Integer> list = ingreService.findHowManyGroup(7001);

		// List<IngredientVO> list =
		// ingreService.findByPkGroupByGroupNo(7001,1);

		// 食材查全部
		// List<IngredientVO> list = ingreService.getAll();

		// 查詢食材By ingre_no
		// IngredientVO ingredientVO = new IngredientVO();
		// ingredientVO.setIngreNo(100);
		// IngredientVO vo = ingreService.findByIngreNo(ingredientVO);

		// insert ingredient
		// IngredientVO vo = new IngredientVO();
		// vo.setiName("糖霜");
		// vo.setCreateDt(new java.sql.Date(new java.util.Date().getTime()));
		// vo.setGroupNo(4);
		// vo.setQuantity("20g");
		// vo.setRcpSeq(7002);
		// vo.setGroupName("覆盆子凍");
		// ingreService.addRcpData(vo);

		// update
		// IngredientVO vo = new IngredientVO();
		// vo.setiName("巧克力粉");
		// vo.setCreateDt(new java.sql.Date(new java.util.Date().getTime()));
		// vo.setGroupNo(4);
		// vo.setQuantity("555g");
		// vo.setRcpSeq(7002);
		// vo.setGroupName("覆盆子凍");
		// vo.setIngreNo(124);
		// ingreService.update(vo);

		// delete ingredient
		// IngredientVO vo = new IngredientVO();
		// vo.setIngreNo(124);
		// ingreService.delete(vo);

		System.out.println(".....");

		context.close();
	}
}
